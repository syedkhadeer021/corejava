package net.konic.corejava.constructor;

public class Employee {
	/**
	 * Employee Salary Slip (Parameterized Constructor)
	 * 
	 * Input: name=“Aisha”, salary=30000 Output: Employee: Aisha Monthly Salary:
	 * 30000 Yearly Salary: 360000
	 * 
	 * ✳ Task:
	 * 
	 * Use parameterized constructor to set name & salary
	 * 
	 * Method yearlySalary() returns yearly salary
	 * 
	 * 
	 * 
	 */

	    String name;
	    double salary;

	    Employee(String n, double s) {
	        name = n;
	        salary = s;
	    }

	    double yearlySalary() {
	        return salary * 12;
	    }

	    void showSlip() {
	        System.out.println("Employee: " + name);
	        System.out.println("Monthly Salary: " + salary);
	        System.out.println("Yearly Salary: " + yearlySalary());
	    }

	    public static void main(String[] args) {

	        Employee emp = new Employee("SYED", 45000);

	       
	        emp.showSlip();
	    }
	}


