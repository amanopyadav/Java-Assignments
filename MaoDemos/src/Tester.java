import java.util.*;

public class Tester {

	public static void main(String[] args) {
		Map<Integer , String> map = new TreeMap<>();
		
		map.put(365, "Raja");
		map.put(432, "Suresh");
		map.put(234, "Amit");
		
		System.out.println(map);
		
		Set<Integer>keys = map.keySet();
		for(Integer Key:keys)
		{
			System.out.println(map.get(Key));
			
		}
		

	}

}
