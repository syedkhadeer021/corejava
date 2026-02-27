package net.konic.corejava.collections;

import java.util.HashSet;
import java.util.Set;

public class Employee2Hashset {

    Set<Employee2> addEmployees() {

        Set<Employee2> set = new HashSet<>();

        Employee2 e1 = new Employee2();
        e1.setId(101);
        e1.setName("Ayaan");
        e1.setDept("IT");

        Employee2 e2 = new Employee2();
        e2.setId(102);
        e2.setName("Rahim");
        e2.setDept("HR");

        Employee2 e3 = new Employee2();
        e3.setId(103);
        e3.setName("Sara");
        e3.setDept("Finance");

        set.add(e1);
        set.add(e2);
        set.add(e3);

        return set;
    }

    // 🔹 Check employee exists by ID
    boolean checkEmployeeExists(int id) {

        Set<Employee2> set = addEmployees();

        Employee2 temp = new Employee2();
        temp.setId(id);

        return set.contains(temp);
    }

    public static void main(String[] args) {

        Employee2Hashset obj = new Employee2Hashset();
        int id = 101;

        if (obj.checkEmployeeExists(id)) {
            System.out.println("Employee Found :" + id );
        } else {
            System.out.println("Employee Not Found");
        }
    }
}
