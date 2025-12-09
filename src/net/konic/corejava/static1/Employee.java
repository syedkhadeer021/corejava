package net.konic.corejava.static1;

public class Employee {
	/**
	 * Create a class Employee • static variable companyName • instance variables:
	 * empId, empName • constructor sets instance values Task: Call showDetails()
	 * and print. Input example: 101, "Anees" Output: Employee details + company
	 * name
	 * 
	 * 
	 */

	static String companyName = "WIPRo";

	int empId;
	String empName;

	Employee(int id, String name) {
		empId = id;
		empName = name;
	}

	public void showDetails() {
		System.out.println("Employee ID   : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Company       : " + companyName);
	}

	public static void main(String[] args) {

		Employee emp = new Employee(101, "Anees");
		 emp.showDetails();
	}
}
