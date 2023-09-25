class Account
{
	private int balance;
	public Account(int b) {
		balance = b;
	}
	
	public void deposite(int amount) {
		balance = balance+amount;
	}
	public void withdraw(int amount) throws Exception {
		if(amount>balance)
			throw new Exception("Insufficent balance  - Low Balance");
		else if (amount>15000)
			throw new Exception("Overlimit - Cannot withdraw more than 15000 in a transaction");
		balance = balance-amount;
		
	}
}




public class Tester {

	public static void main(String[] args) {
		Account acc = new Account(35000);
		try {
			acc.withdraw(50000);
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		{
			
		}
		

	}

}
