package net.konic.corejava.collections;

import java.util.HashSet;
import java.util.Set;

public class EmployeeHashSet {

    Set<Employee> storeEmployees() {

        Set<Employee> set = new HashSet<>();

        Employee e1 = new Employee();
        e1.setId(101);
        e1.setName("Ayaan");
        e1.setDept("IT");

        Employee e2 = new Employee();
        e2.setId(102);
        e2.setName("Rahim");
        e2.setDept("HR");

        Employee e3 = new Employee();
        e3.setId(103);
        e3.setName("Sara");
        e3.setDept("Finance");

        Employee e4 = new Employee();     // duplicate of e1
        e4.setId(101);
        e4.setName("Ayaan");
        e4.setDept("IT");

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);   // ❌ duplicate, will NOT be added

        return set;
    }

    public static void main(String[] args) {

        EmployeeHashSet obj = new EmployeeHashSet();
        Set<Employee> employees = obj.storeEmployees();

        System.out.println("Employees stored (no duplicates)");
        System.out.println(employees);
    }
}
