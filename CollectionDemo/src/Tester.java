import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Tester {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
	
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	System.out.println(list);
	for(Integer val:list)
		System.out.println(val+" ");
	
	System.out.println();
	
	Iterator<Integer> itr=list.iterator();
	while(itr.hasNext()) {
		System.out.print(itr.next()+" ");
		
	}
	System.out.println("\n"+list.get(3));
	

	}

}
