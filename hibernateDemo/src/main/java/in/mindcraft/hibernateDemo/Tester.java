package in.mindcraft.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.util.xml.XmlDocument;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class Tester {

public static void main(String[] args) {
	Laptop l1 = new Laptop();
	l1.setLid(123);
	l1.setMake("Dell");
	
	Laptop l2 = new Laptop();
	l2.setLid(107);
	l2.setMake("Asus");
	
		
		Student s1 = new Student();
		s1.setRollno(101);
		s1.setName("Jay");
		s1.setLaptop(l1);
		
		s1.getList().addl1);
		s1.getList().add(l2);
		
		
		
		
		Configuration con=new Configuration().configure();
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf=con.buildSessionFactory(reg);
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		session.save(s1);
		session.save(l1);
		session.save(l2);
		tx.commit();
		
	}
}


