package net.konic.corejava.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Employee12LinkedHashset {

    Employee12 getFirstEmployee() {

        Set<Employee12> set = new LinkedHashSet<>();

        Employee12 e1 = new Employee12();
        e1.setId(101);
        e1.setName("Ayaan");
        e1.setDept("IT");

        Employee12 e2 = new Employee12();
        e2.setId(102);
        e2.setName("Rahim");
        e2.setDept("HR");

        Employee12 e3 = new Employee12();
        e3.setId(103);
        e3.setName("Sara");
        e3.setDept("Finance");

        // insertion order
        set.add(e1);
        set.add(e2);
        set.add(e3);

        // 🔹 get first employee using iterator
        Iterator<Employee12> it = set.iterator();
        return it.hasNext() ? it.next() : null;
    }

    public static void main(String[] args) {

        Employee12LinkedHashset obj = new Employee12LinkedHashset();
        Employee12 first = obj.getFirstEmployee();

        System.out.println("First Employee: " + first);
    }
}
