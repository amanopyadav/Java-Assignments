package in.mindcraft;

public class SalesPerson {
	private static Object c;
	private int hours;
	private int rates;
	private int comm;
	
	public SalesPerson() {
		
	}
	public SalesPerson(int id, String n, int d, int m, int y, int h, int r) {
		super();
		hours = 0;
		rates = 0;
		
		
	}
	
	public int calculateSalary() {
		return super.calculateSalary() + sales*comm;
	}
	
	public void show() {
		
		System.out.println(hours);
		System.out.println(rates);
		System.out.println(comm);
		
	}
	
	

}
