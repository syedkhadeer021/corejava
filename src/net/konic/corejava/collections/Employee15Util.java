package net.konic.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class Employee15Util {

    // create employees
    List<Employee15> addEmployees() {

        List<Employee15> list = new ArrayList<>();

        Employee15 e1 = new Employee15();
        e1.setId(101);
        e1.setName("Ayaan");
        e1.setDept("IT");

        Employee15 e2 = new Employee15();
        e2.setId(102);
        e2.setName("Rahim");
        e2.setDept("HR");

        Employee15 e3 = new Employee15();
        e3.setId(103);
        e3.setName("Sara");
        e3.setDept("Finance");

        list.add(e1);
        list.add(e2);
        list.add(e3);

        return list;
    }

    // 🔹 Q20: return list of employee names
    List<String> getAllEmployeeNames() {

        List<Employee15> employees = addEmployees();
        List<String> names = new ArrayList<>();

        for (Employee15 e : employees) {
            names.add(e.getName());
        }
        return names;
    }

    public static void main(String[] args) {

        Employee15Util obj = new Employee15Util();
        System.out.println(obj.getAllEmployeeNames());
    }
}
