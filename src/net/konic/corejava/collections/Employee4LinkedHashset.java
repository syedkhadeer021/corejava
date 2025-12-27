package net.konic.corejava.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Employee4LinkedHashset {

    void printEmployeesInOrder() {

        Set<Employee4> set = new LinkedHashSet<>();

        Employee4 e1 = new Employee4();
        e1.setId(101);
        e1.setName("Ayaan");
        e1.setDept("IT");

        Employee4 e2 = new Employee4();
        e2.setId(102);
        e2.setName("Rahim");
        e2.setDept("HR");

        Employee4 e3 = new Employee4();
        e3.setId(103);
        e3.setName("Sara");
        e3.setDept("Finance");

        // insertion order
        set.add(e1);
        set.add(e2);
        set.add(e3);

        // 🔹 print to prove order
        for (Employee4 e : set) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        Employee4LinkedHashset obj = new Employee4LinkedHashset();
        obj.printEmployeesInOrder();
    }
}
