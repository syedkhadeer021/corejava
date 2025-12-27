package net.konic.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class Emp3Set {

    // Add employees
    List<Emp3> addEmployees() {

        List<Emp3> list = new ArrayList<>();

        Emp3 e1 = new Emp3();
        e1.setId(101);
        e1.setName("Ayaan");
        e1.setDept("IT");

        Emp3 e2 = new Emp3();
        e2.setId(102);
        e2.setName("Rahim");
        e2.setDept("HR");

        Emp3 e3 = new Emp3();
        e3.setId(103);
        e3.setName("Sara");
        e3.setDept("Finance");

        list.add(e1);
        list.add(e2);
        list.add(e3);

        return list;
    }

    // 🔹 Update department at index 2
    Emp3 updateDepartment() {

        List<Emp3> list = addEmployees();

        Emp3 emp = list.get(2);      // index 2 → Sara
        emp.setDept("Admin");        // update department

        return emp;
    }

    public static void main(String[] args) {

        Emp3Set obj = new Emp3Set();
        Emp3 updatedEmp = obj.updateDepartment();

        System.out.println("Updated Employee: " + updatedEmp);
    }
}
