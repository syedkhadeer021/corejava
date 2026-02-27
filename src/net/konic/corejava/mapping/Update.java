package net.konic.corejava.mapping;

import java.util.HashMap;
import java.util.Map;

public class Update {

	public static void main(String[] args) {
		Map<Integer, Employee> map = new HashMap<>();
		map.put(101, new Employee(101, "Ayaan", "IT"));
		map.put(102, new Employee(102, "Rahim", "HR"));
		map.put(103, new Employee(103, "Sara", "Finance"));

        // Update department for employee ID 103
        map.put(103, new Employee(103, "Sara", "Admin"));
        
        System.out.println("update employee :" + map.get(103) );
		
	}
	

}
