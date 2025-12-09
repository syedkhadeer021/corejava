package net.konic.corejava.Methods2;

public class Employee {
	/**
	 * Employee Salary Program
	 * 
	 * Instance variables: name, salary
	 * 
	 * Method setDetails(name, salary)
	 * 
	 * Method getYearlySalary() → return type = double
	 * 
	 * Print result in main.
	 * 
	 */
	 String name;      
	    double salary;    

	    public void setDetails(String n, double s) {
	        name = n;
	        salary = s;
	    }

	    public double getYearlySalary() {
	        return salary * 12;
	    }

	    public static void main(String[] args) {

	        Employee emp = new Employee();

	        emp.setDetails("abcd", 40000.90);  

	        double yearly = emp.getYearlySalary(); 

	        System.out.println("Employee Name: " + emp.name);
	        System.out.println("Yearly Salary: " + yearly);
	    }
	

}
