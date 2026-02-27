package net.konic.corejava.mapping;

import java.util.HashMap;
import java.util.Map;

public class Found {
	public static void main(String[] args) {
		Map<Integer, Employee> map = new HashMap<>();
		map.put(101, new Employee(101, "Ayaan", "IT"));
		map.put(102, new Employee(102, "Rahim", "HR"));
		map.put(103, new Employee(103, "Sara", "Finance"));
		 Employee e1 = map.get(102);
		if(e1 == map.get(102)) {
			System.out.println("Found : " +e1);
			
		}else {
			System.out.println("Not Found");
		}
	}
	
}
