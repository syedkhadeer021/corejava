package net.konic.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class Employee9List {

    // add employees
    List<Employee9> addEmployees() {

        List<Employee9> list = new ArrayList<>();

        Employee9 e1 = new Employee9();
        e1.setId(101);
        e1.setName("Ayaan");
        e1.setDept("IT");

        Employee9 e2 = new Employee9();
        e2.setId(102);
        e2.setName("Rahim");
        e2.setDept("HR");

        Employee9 e3 = new Employee9();
        e3.setId(103);
        e3.setName("Sara");
        e3.setDept("Finance");

        list.add(e1);
        list.add(e2);
        list.add(e3);

        return list;
    }

    // 🔹 check employee exists by ID
    boolean isEmployeeExists(int id) {

        List<Employee9> list = addEmployees();

        for (Employee9 e : list) {
            if (e.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Employee9List obj = new Employee9List();
        int id = 105;

        if (obj.isEmployeeExists(id)) {
            System.out.println("Employee Found");
        } else {
            System.out.println("Employee Not Found");
        }
    }
}
