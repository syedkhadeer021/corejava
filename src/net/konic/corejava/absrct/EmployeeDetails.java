package net.konic.corejava.absrct;

class Employee{
	private double salary;
	private String name;
	public double getSalary() {
		return salary;
		
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class EmployeeDetails {
public static void main(String[] args) {
	Employee employee= new Employee();
	employee.setSalary(9087.9);
	
	System.out.println(employee.getSalary());
	
}
}
