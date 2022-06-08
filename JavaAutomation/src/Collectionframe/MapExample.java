package Collectionframe;

import java.util.*;
import java.util.Map.Entry;
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MapInterface();
		HashMapClass();
	} 
	// Map - Key,Value data type. collection
	// Map - HashMap, LinkedHashMap, TreeMap
	// HashMap,LinkedHashMap -> key and value allow null
	// TreeMap - null is not allowed for key and value
	// Key - Always unique
	// Value - might be duplicate
	
	public static void MapInterface() {
		Map<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(1, "Java");
		mp.put(2, "C#");
		mp.put(3, "Python");
		mp.put(4, "Oracle");
		mp.put(4, "MS-SQL"); // add new value as well as modified existing value
		System.out.println(mp);
		System.out.println(mp.get(1));
		Set<Integer> keys=mp.keySet();
		System.out.println(keys);
		// fetch keys and values using for each Entry class 
		for(Entry<Integer, String> m:mp.entrySet()) {
			System.out.println("Keys -> "+m.getKey() +"\t Values ->"+m.getValue());
		}
		
		//Iterator
		System.out.println("--------------- By using iterator ----------");
		@SuppressWarnings("rawtypes")
		Iterator itr=(Iterator) mp.entrySet();
		while(itr.hasNext()) {
			@SuppressWarnings("unchecked")
			Entry<Integer,String> ent=(Entry<Integer, String>) itr.next();
			System.out.println(ent.getKey());
			System.out.println(ent.getValue());
		}
		
	}
	public static void HashMapClass() {
		HashMap<String,Integer> hmap=new HashMap<String,Integer>();
		hmap.put("Java", new Integer(100));
		hmap.put("C#", new Integer(200));
		hmap.put("Python", new Integer(300));
		System.out.println(hmap);
		for(Entry<String,Integer> ent:hmap.entrySet()) {
			System.out.println(ent.getKey());
			System.out.println(ent.getValue());
		}
	}

}
