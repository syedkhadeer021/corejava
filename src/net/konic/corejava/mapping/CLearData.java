package net.konic.corejava.mapping;

import java.util.LinkedHashMap;
import java.util.Map;

public class CLearData {
	public static void main(String[] args) {
		Map<Integer, Employee> map = new LinkedHashMap();

		map.put(101, new Employee(101, "Ayaan", "IT"));
		map.put(102, new Employee(102, "Rahim", "HR"));
		map.put(103, new Employee(103, "Sara", "Finance"));
		
		
		map.clear();
		System.out.println("Employee Records Cleared.");
	}

}
