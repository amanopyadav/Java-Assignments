class Polygon
{	
	
}

class Circle extends Polygon
{
	private int radius;
	
	public Circle() {
		radius=1;
		
	}
	public double calcArea() {
		return 3.142f*radius*radius;
		
	}
	public double calcperi() {
		return 2*3.142*radius;
	}
		
	class Rectangle extends Polygon{
		private int len, brd;
		
		public Rectangle() {
			len=brd=1;
			
		}
		
		public Rectangle(int 1, int b) {
			len = l;
			brd = b;
			
		}
		public double calcArea() {
			return len*brd;
		}
		public double calcPeri() {
			return 2*(len+brd);
		}
	}
	class sqaure extends Rectangle{
		
		public Square() {
			
		}
		
		public Sqaure(int s) {
			super(s,s);
		}
		public double calcArea() {
			return super.calcArea();
		}
		public double calcPeri() {
			return super.calcPeri();
		}
		
	}
	


public class Tester {

	public static void main(String[] args) {
		Circle c = new Circle(10);
		System.out.println(c.calcArea());
		System.out.println(c.calPeri());
		
		

	}
}
}


