package net.konic.corejava.isas;
class Person{
	String name;
	int age;
}
class Employee extends Person{
	double salary;
}
public class EmployeePersonDemo{
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name="Shiraz";
		e.age=28;
		e.salary=50000;
		System.out.println("person : " +e.name);
		System.out.println("Age : " +e.age );
		System.out.println("Employee salary : " +e.salary);
		
	}
}