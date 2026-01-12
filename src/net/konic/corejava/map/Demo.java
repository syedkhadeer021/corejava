package net.konic.corejava.map;

import java.util.Map;

import java.util.TreeMap;
 
public class Demo {
	 
	    public static void main(String[] args) {
	

	        Map<Integer, String> map = new TreeMap<>();
	 
	        map.put(102, "Ahmed");

	        map.put(103, "Syed");

	        map.put(101, "Khadeer");
	 
	        map.put(102, "Ahmed");

	        map.put(104, null);
	 
	        System.out.println(map);

	        System.out.println(map.get(101));
	 
	        System.out.println(map.containsKey(103));
	 

	        System.out.println(map.containsValue("Khadeer"));
	 

	        map.remove(104);

	        System.out.println(map);
	 

	        for (Map.Entry<Integer, String> entry : map.entrySet()) {

	            System.out.println(entry.getKey() + " -> " + entry.getValue());

	        }
	 

	        TreeMap<Integer, String> treeMap = (TreeMap<Integer, String>) map;

	        System.out.println( treeMap.firstKey());

	        System.out.println(treeMap.lastKey());
	 
	        System.out.println("\nTotal entries: " + treeMap.size());
	 
	     

	        treeMap.clear();

	        System.out.println(treeMap);

	    }

	}


