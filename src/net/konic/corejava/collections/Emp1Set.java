package net.konic.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class Emp1Set {

    // Method to add employees
    List<Emp1> addEmployees() {

        List<Emp1> list = new ArrayList<>();

        Emp1 e1 = new Emp1();
        e1.setId(101);
        e1.setName("Ayaan");
        e1.setDept("IT");

        Emp1 e2 = new Emp1();
        e2.setId(102);
        e2.setName("Rahim");
        e2.setDept("HR");

        Emp1 e3 = new Emp1();
        e3.setId(103);
        e3.setName("Sara");
        e3.setDept("Finance");

        list.add(e1);
        list.add(e2);
        list.add(e3);

        return list;
    }

    //  Q2: Get Employee by Index
    Emp1 getEmployeeByIndex(int index) {

        List<Emp1> list = addEmployees();
        return list.get(index);
    }

    public static void main(String[] args) {

        Emp1Set obj = new Emp1Set();

        int index = 1;
        Emp1 emp = obj.getEmployeeByIndex(index);

        System.out.println("Employee: " + emp);
    }
}
