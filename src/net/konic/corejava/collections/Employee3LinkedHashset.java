package net.konic.corejava.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Employee3LinkedHashset {

    // Q8: Store Employees with Order
    Set<Employee3> storeEmployeesWithOrder() {

        Set<Employee3> set = new LinkedHashSet<>();

        Employee3 e1 = new Employee3();
        e1.setId(101);
        e1.setName("Ayaan");
        e1.setDept("IT");

        Employee3 e2 = new Employee3();
        e2.setId(102);
        e2.setName("Rahim");
        e2.setDept("HR");

        Employee3 e3 = new Employee3();
        e3.setId(103);
        e3.setName("Sara");
        e3.setDept("Finance");

        // insertion order is preserved
        set.add(e1);
        set.add(e2);
        set.add(e3);

        return set;
    }

    public static void main(String[] args) {

        Employee3LinkedHashset obj = new Employee3LinkedHashset();
        Set<Employee3> employees = obj.storeEmployeesWithOrder();

        System.out.println(employees);
    }
}
