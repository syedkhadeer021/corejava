package net.konic.corejava.collections;

import java.util.HashSet;
import java.util.Set;

public class Employee7Set {

    void clearEmployeeRecords() {

        Set<Employee7> set = new HashSet<>();

        Employee7 e1 = new Employee7();
        e1.setId(101);
        e1.setName("Ayaan");
        e1.setDept("IT");

        Employee7 e2 = new Employee7();
        e2.setId(102);
        e2.setName("Rahim");
        e2.setDept("HR");

        Employee7 e3 = new Employee7();
        e3.setId(103);
        e3.setName("Sara");
        e3.setDept("Finance");

        set.add(e1);
        set.add(e2);
        set.add(e3);

        // 🔹 clear all employees
        set.clear();

        if (set.isEmpty()) {
            System.out.println("Employee Records Cleared");
        }
    }

    public static void main(String[] args) {

        Employee7Set obj = new Employee7Set();
   
        obj.clearEmployeeRecords();
    }
}
