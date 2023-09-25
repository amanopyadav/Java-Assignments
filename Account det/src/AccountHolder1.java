import java.util.Scanner;
public class AccountHolder1 {
  
	private int accno;
	private String name;
	private double balance;
	
	public AccountHolder1() {
		
	}
	
	public void AccountHolder(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposite(double amaount)
	{
		double amount;
		balance = balance-amount;
	}
	public void show() {
		System.out.println(accno+" "+name+" "+balance);
	}
	
	
	while(true) {
		System.out.print("1.Add a record");
	}
};
while(true) {
	System.out.print("1.Add a record");
	System.out.print("2.Show all record");
	System.out.print("3.Deposite");
	System.out.print("4.Withdraw");
	System.out.print("5.Exit");
	choice=sc.nextInt();
	switch(choice) {
	case 1:
		System.out.println("Enter account number, name and balance:");
		arr[cnt++]=new AccountHolder(sc.next(),sc.nextdouble());
		break;
	case 2:
		for(int i = 0; i<cnt; i++)
			arr[i].show();
		break;
	case 3:
		System.out.println("Enter account number:");
		accno=sc.nextInt();
		for(int i=0; i<cnt; i++) {
			if(arr[i].getAccno()==accno) {
				System.out.println("Enter ammount to be deposited:");
				arr[i].deposite(sc.nextdouble());
			}
		}
		break;
	case 4:
		System.out.println("Enter account number:");
		accno=sc.nextInt();
		for(int i=0; i<cnt; i++) {
			if)arr[i].getAccno()==accno)
{
	System.out.println("Enter ammount to be withdraw:");
	arr[i].withdraw(sc.nextInt());
}
		}
		break;
	case 5:
		System.exit(0);
	
}

}
			}
		}
	
}

