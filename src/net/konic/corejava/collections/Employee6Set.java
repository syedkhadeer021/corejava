package net.konic.corejava.collections;

import java.util.HashSet;
import java.util.Set;

public class Employee6Set {

    int getEmployeeCount() {

        Set<Employee6> set = new HashSet<>();

        Employee6 e1 = new Employee6();
        e1.setId(101);
        e1.setName("Ayaan");
        e1.setDept("IT");

        Employee6 e2 = new Employee6();
        e2.setId(102);
        e2.setName("Rahim");
        e2.setDept("HR");

        Employee6 e3 = new Employee6();
        e3.setId(103);
        e3.setName("Sara");
        e3.setDept("Finance");

        set.add(e1);
        set.add(e2);
        set.add(e3);

        return set.size();   // 🔹 employee count
    }

    public static void main(String[] args) {

        Employee6Set obj = new Employee6Set();
        int count = obj.getEmployeeCount();

        System.out.println("Employee Count: " + count);
    }
}
