package net.konic.corejava.collections;

import java.util.HashSet;
import java.util.Set;

public class Employee10Set {

    Set<Employee10> set = new HashSet<>();

    // 🔹 add employee only if ID is unique
    void addEmployee(Employee10 emp) {

        if (set.add(emp)) {
            System.out.println("Employee Added Successfully");
        } else {
            System.out.println("Duplicate Employee – Not Added");
        }
    }

    public static void main(String[] args) {

        Employee10Set obj = new Employee10Set();

        Employee10 e1 = new Employee10();
        e1.setId(101);
        e1.setName("Ayaan");
        e1.setDept("IT");

        Employee10 e2 = new Employee10();
        e2.setId(101);   // duplicate ID
        e2.setName("Ayaan");
        e2.setDept("IT");

        obj.addEmployee(e1);
        obj.addEmployee(e2);
    }
}
