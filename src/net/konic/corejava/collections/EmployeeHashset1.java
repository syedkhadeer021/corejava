package net.konic.corejava.collections;

import java.util.HashSet;
import java.util.Set;

public class EmployeeHashset1 {

    int addDuplicateEmployee() {

        Set<Employee1> set = new HashSet<>();

        Employee1 e1 = new Employee1();
        e1.setId(101);
        e1.setName("Ayaan");
        e1.setDept("IT");

        Employee1 e2 = new Employee1();
        e2.setId(102);
        e2.setName("Rahim");
        e2.setDept("HR");

        Employee1 e3 = new Employee1();
        e3.setId(103);
        e3.setName("Sara");
        e3.setDept("Finance");

        // 🔴 NEW OBJECT but SAME ID as e1 (duplicate)
        Employee1 e4 = new Employee1();
        e4.setId(101);
        e4.setName("Ayaan");
        e4.setDept("IT");

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);   // ❌ duplicate (same id)

        return set.size();
    }

    public static void main(String[] args) {

        EmployeeHashset1 obj = new EmployeeHashset1();
        int size = obj.addDuplicateEmployee();

        System.out.println("Total Employees in HashSet: " + size);
    }
}
