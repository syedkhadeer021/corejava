package net.konic.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class Emp2Set {

    // Method to add employees
    List<Emp2> addEmployees() {

        List<Emp2> list = new ArrayList<>();

        Emp2 e1 = new Emp2();
        e1.setId(101);
        e1.setName("Ayaan");
        e1.setDept("IT");

        Emp2 e2 = new Emp2();
        e2.setId(102);
        e2.setName("Rahim");
        e2.setDept("HR");

        Emp2 e3 = new Emp2();
        e3.setId(103);
        e3.setName("Sara");
        e3.setDept("Finance");

        list.add(e1);
        list.add(e2);
        list.add(e3);

        return list;
    }

    // 🔹 Count Employees
    int countEmployees() {

        List<Emp2> list = addEmployees();
        return list.size();
    }

    public static void main(String[] args) {

        Emp2Set obj = new Emp2Set();
        int count = obj.countEmployees();

        System.out.println("Total Employees: " + count);
    }
}
