package test.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		for(Map.Entry<Integer,String> entry: map.entrySet()) {
			System.out.println("Key :"+entry.getKey()+ " Value :"+entry.getValue());
		}
	}

}
