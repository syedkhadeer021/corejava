package net.konic.corejava.mapping;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintAll {
	public static void main(String[] args) {
		Map<Integer, Employee> map = new LinkedHashMap();
		map.put(101, new Employee(101, "Ayaan", "IT"));
		map.put(102, new Employee(102, "Rahim", "HR"));
		map.put(103, new Employee(103, "Sara", "Finance"));
		
		for(Entry<Integer, Employee> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}

}
}
