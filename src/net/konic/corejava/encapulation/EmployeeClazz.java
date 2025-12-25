package net.konic.corejava.encapulation;

public class EmployeeClazz {
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if(salary >0) {
			this.salary = salary;
		}else {
			System.out.println("Invalid salary");
		}
	}
	public static void main(String[] args) {
		EmployeeClazz empClazz = new EmployeeClazz();
		empClazz.setSalary(10000);
		System.out.println("Salary :" +empClazz.getSalary());
	}
	


}