package in.mindcraft;

public class WageEmployee extends Employee {
	private int hours;
	private int rates;
	
	public WageEmployee() {
		
	}

	 public WageEmployee(int id, String n, int d, int m, int y, int h, int r) {
		 super(id,n,d,m,y);
		 hours=0;
		 rates=0;
		 
	 }
		 
	 
	 
	 public void show() {
		 super.show();
		 System.out.println(hours);
		 System.out.println(rates);
		 
	 }
	 }
