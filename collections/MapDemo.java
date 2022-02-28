package com.infosys.collections;
import java.util.*;
import java.util.Map.Entry;


public class MapDemo {

	public static void main(String[] args) {
		/*
		 * Map<Integer,Object> hmap=new HashMap<Integer,Object>(); hmap.put(5, new
		 * Date()); hmap.put(2, null); hmap.put(1, null); hmap.put(9, null); hmap.put(8,
		 * new Course(101,"Java")); hmap.put(10, new Course(101,"Java")); hmap.put(19,
		 * "webservices"); hmap.put(null, new Course(101,"Java"));
		 * System.out.println(hmap.get(5)); System.out.println(hmap.containsKey(1));
		 * System.out.println(hmap.containsValue("rest")); System.out.println(hmap); Set
		 * keys=hmap.keySet(); //K System.out.println(keys); Iterator
		 * i2=keys.iterator(); while(i2.hasNext()) System.out.println(i2.next());
		 * Collection val=hmap.values(); //V System.out.println(val); Set
		 * eset=hmap.entrySet(); //K-V //System.out.println(eset)); Iterator
		 * it=eset.iterator(); while(it.hasNext()){ Entry entry=(Entry)it.next();
		 * System.out.println(entry.getKey()+"  "+entry.getValue()); }
		 */

		
		      //synchronized 
		//HashMap,LinkedHashMap,TreeMap,Hashtable
		//Map<Integer,Object> map=new Hashtable<>();
		Map<Integer,Object> map=new HashMap<>();
		map.put(2,3);
		map.put(5,7);
		map.put(1,3);
		map.put(6,7);
		map.put(9,3);
		map.put(8,25);
		map.put(8,7);
		
		
		
		//map.put(null,7);
		
		System.out.println(map);
		
	//	
		Map<User,String> um=new HashMap<>();
		um.put(new User(1, "Ram1"),"user A");
		um.put(new User(2, "Ram2"),"user B");
		um.put(new User(1, "Ram1"),"user C");
		um.put(new User(2, "Ram2"),"user D");
		um.put(new User(3, "Ram3"),"user E");
		
		
		System.out.println(um);
	}

}
