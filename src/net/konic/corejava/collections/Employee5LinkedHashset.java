package net.konic.corejava.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Employee5LinkedHashset {

    Set<Employee5> removeEmployeeById(int id) {

        Set<Employee5> set = new LinkedHashSet<>();

        Employee5 e1 = new Employee5();
        e1.setId(101);
        e1.setName("Ayaan");
        e1.setDept("IT");

        Employee5 e2 = new Employee5();
        e2.setId(102);
        e2.setName("Rahim");
        e2.setDept("HR");

        Employee5 e3 = new Employee5();
        e3.setId(103);
        e3.setName("Sara");
        e3.setDept("Finance");

        set.add(e1);
        set.add(e2);
        set.add(e3);

        // 🔹 remove by ID using temporary object
        Employee5 temp = new Employee5();
        temp.setId(id);

        set.remove(temp);

        return set;
    }

    public static void main(String[] args) {

        Employee5LinkedHashset obj = new Employee5LinkedHashset();
        Set<Employee5> remaining = obj.removeEmployeeById(102);

        System.out.println("Remaining Employees: " + remaining);
    }
}
