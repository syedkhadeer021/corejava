package net.konic.corejava.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Employee11Util {

    // create list with duplicates
    List<Employee11> createEmployeeList() {

        List<Employee11> list = new ArrayList<>();

        Employee11 e1 = new Employee11();
        e1.setId(101);
        e1.setName("Ayaan");
        e1.setDept("IT");

        Employee11 e2 = new Employee11();
        e2.setId(102);
        e2.setName("Rahim");
        e2.setDept("HR");

        Employee11 e3 = new Employee11();
        e3.setId(101);   // duplicate
        e3.setName("Ayaan");
        e3.setDept("IT");

        list.add(e1);
        list.add(e2);
        list.add(e3);

        return list;
    }

    // 🔹 convert List to HashSet
    Set<Employee11> convertListToSet() {

        List<Employee11> list = createEmployeeList();
        Set<Employee11> set = new HashSet<>(list);

        return set;
    }

    public static void main(String[] args) {

        Employee11Util obj = new Employee11Util();
        Set<Employee11> set = obj.convertListToSet();

        System.out.println("Duplicate Employees Removed");
        System.out.println(set);
    }
}
