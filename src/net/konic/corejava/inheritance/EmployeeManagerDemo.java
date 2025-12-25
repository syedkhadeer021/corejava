package net.konic.corejava.inheritance;
class Employee {
    String name;
    int salary;
}

class Manager extends Employee {
    String department;
}

public class EmployeeManagerDemo {
    public static void main(String[] args) {
        
        Manager m = new Manager();
        m.name = "Sameer";
        m.salary = 50000;
        m.department = "IT";
        
        System.out.println("Name: " + m.name);
        System.out.println("Salary: " + m.salary);
        System.out.println("Department: " + m.department);
    }
}

