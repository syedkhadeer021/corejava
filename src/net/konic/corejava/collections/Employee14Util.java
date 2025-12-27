package net.konic.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class Employee14Util {

	// create employee list
	List<Employee14> getEmployees() {

		List<Employee14> list = new ArrayList<>();

		Employee14 e1 = new Employee14();
		e1.setId(101);
		e1.setName("Ayaan");
		e1.setDept("IT");

		list.add(e1);

		return list; // try returning empty list to test "No Employee Data"
	}

	// 🔹 check employee data empty
	void checkEmployeeDataEmpty() {

		List<Employee14> list = getEmployees();

		if (list.isEmpty()) {
			System.out.println("No Employee Data");
		} else {
			System.out.println("Employee Data Exists");
		}
	}

	public static void main(String[] args) {

		Employee14Util obj = new Employee14Util();
		obj.checkEmployeeDataEmpty();
	}
}
