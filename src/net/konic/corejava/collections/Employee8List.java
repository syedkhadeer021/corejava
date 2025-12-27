package net.konic.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class Employee8List {

    // add employees
    List<Employee8> addEmployees() {

        List<Employee8> list = new ArrayList<>();

        Employee8 e1 = new Employee8();
        e1.setId(101);
        e1.setName("Ayaan");
        e1.setDept("IT");

        Employee8 e2 = new Employee8();
        e2.setId(102);
        e2.setName("Rahim");
        e2.setDept("HR");

        Employee8 e3 = new Employee8();
        e3.setId(103);
        e3.setName("Sara");
        e3.setDept("Finance");

        list.add(e1);
        list.add(e2);
        list.add(e3);

        return list;
    }

    // 🔹 Get employees by department
    List<Employee8> getEmployeesByDepartment(String dept) {

        List<Employee8> allEmployees = addEmployees();
        List<Employee8> result = new ArrayList<>();

        for (Employee8 e : allEmployees) {
            if (e.getDept().equalsIgnoreCase(dept)) {
                result.add(e);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Employee8List obj = new Employee8List();
        String department = "IT";

        List<Employee8> employees = obj.getEmployeesByDepartment(department);

        System.out.println(employees);
    }
}
