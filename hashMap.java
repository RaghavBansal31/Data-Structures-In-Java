package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMap {

	public static void insertValue() {
		HashMap<Integer,String> obj = new HashMap<>();
		obj.put(1, "ABC");
		obj.put(2, "DEF");
		obj.put(3, "GHI");
		obj.put(4, "JKL");
		obj.put(5, "MNO");
		obj.put(6, "PQR");
		
		Set<Entry<Integer,String>> set = obj.entrySet();
		
		for(Entry<Integer,String> entry: set) {
			System.out.println(entry.getKey() + " -------- "+  entry.getValue());
		}
		
		obj.replace(1, "Don");
		obj.remove(5, "MNO");
	
		System.out.println();
		for(Entry<Integer,String> entry: set) {
			System.out.println(entry.getKey() + " -------- "+  entry.getValue());
		}
		
		
		System.out.println();
		for(Entry<Integer, String> entry : obj.entrySet()) {
			System.out.println(entry.getKey() + " -------- "+  entry.getValue());
		}
		
	
	
	}
	public static void main(String[] args) {
		
     insertValue();
	}

}
