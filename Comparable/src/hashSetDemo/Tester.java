package hashSetDemo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
class Laptop implements Comparable<Laptop>{
	private int lid;
	private String make;
	private double cost;
	
	public Laptop() {
		lid = 101;
		make = "apple";
		cost = 75000;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(cost, lid, make);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && lid == other.lid
				&& Objects.equals(make, other.make);
	}
	public void Laptop1() {
		lid = 101;
		make = "Apple";
		cost = 75000;
	}
	public Laptop(int lid, String make, double cost) {
		this.lid = lid;
		this.make = make;
		this.cost = cost;
				
	}
	public void show() {
		System.out.println(lid+" "+make+" "+cost);
	}
	public String toString() {
		return "Laptop [lid=" + lid + ",make =" + make + ", cost =" + cost+" \n";
			
		}
	@Override
	public int compareTo(Laptop o) {
		if(this.cost<o.cost)
			return -1;
		else if(this.cost>o.cost)
			return 1;
		else
		return 0;
	}
	
	public int getlid() {
		return lid;
		
	}


	public int getLid() {
		// TODO Auto-generated method stub
		return 0;
	}
			
		}
class LaptopCompare implements Comparator<Laptop>
{
	public int compare(Laptop o1, Laptop o2) {
		if(o1.getLid()<o2.getLid())
			return -1;
		else if(o1.getLid()>o2.getLid())
			return 1;
		else
			return 0;
	}
}

	public class Tester{
		public static void main(String[] args) {
			Set<Laptop> set = new HashSet<>();
			set.add(new Laptop(101,"Dell", 50000));
			set.add(new Laptop(102,"HP", 45000));
			set.add(new Laptop(102,"HP", 45000));
			set.add(new Laptop(103,"Lenovo", 70000));
			
		System.out.println(set);
			
						
			}
			
			
		
	}
