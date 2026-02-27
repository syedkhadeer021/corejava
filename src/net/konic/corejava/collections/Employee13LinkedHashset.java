package net.konic.corejava.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Employee13LinkedHashset {

    Employee13 getLastEmployee() {

        Set<Employee13> set = new LinkedHashSet<>();

        Employee13 e1 = new Employee13();
        e1.setId(101);
        e1.setName("Ayaan");
        e1.setDept("IT");

        Employee13 e2 = new Employee13();
        e2.setId(102);
        e2.setName("Rahim");
        e2.setDept("HR");

        Employee13 e3 = new Employee13();
        e3.setId(103);
        e3.setName("Sara");
        e3.setDept("Finance");

        // insertion order preserved
        set.add(e1);
        set.add(e2);
        set.add(e3);

        // 🔹 get last employee using iterator
        Iterator<Employee13> it = set.iterator();
        Employee13 last = null;

        while (it.hasNext()) {
            last = it.next();
        }
        return last;
    }

    public static void main(String[] args) {

        Employee13LinkedHashset obj = new Employee13LinkedHashset();
        Employee13 last = obj.getLastEmployee();

        System.out.println("Last Employee: " + last);
    }
}
