package in.mindcraft.hibernateinheretance;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Tester {
	public static void main(String[] args) {
		
		Account acc=new Account();
		acc.setAccid(1001);
		acc.setName("Jay");
		acc.setBalance(55000);
		
		SavingsAccount sacc = new SavingsAccount();
		sacc.setAccid(101);
		sacc.setInterestRate(5);
		
		CurrentAccount cacc=new CurrentAccount();
		cacc.setAccid(103);
		cacc.setOverLimit(10000);
	
	



Configuration con=new Configuration().configure();
ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
SessionFactory sf=con.buildSessionFactory(reg);
Session session=sf.openSession();

Transaction tx = session.beginTransaction();
session.save(acc);
session.save(sacc);
session.save(cacc);
tx.commit();
	}

}