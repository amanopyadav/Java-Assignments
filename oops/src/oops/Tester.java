package oops;
class Laptop{
	private int lid;
	private String make;
	private double cost;
	
	public Laptop() {
		lid=101;
		make="apple";
		cost=75000;
	}
	
	public Laptop(int lid, String make, double cost) {
		this.lid = lid;
		this.make = make;
		this.cost = cost;
	}
	public int getlid() {
		return lid;
	}
	public void setlid(int lid) {
		this.lid = lid;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public double getCost() {
		return cost;
	}
	public void show() {
		System.out.println(lid+" "+make+" "+cost);
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}


}
public class Tester {
	public static void main(String[] args) {
		Laptop l3=new Laptop();
		System.out.println(l3.getCost());
		l3.setCost(55000);
		l3.show();
		
		
	}
}