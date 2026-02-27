package net.konic.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class EmpSet {

    // Method to add employees
    List<Emp> addEmployees() {

        List<Emp> list = new ArrayList<>();

        Emp e1 = new Emp();
        e1.setId(101);
        e1.setName("Ayaan");
        e1.setDept("IT");

        Emp e2 = new Emp();
        e2.setId(102);
        e2.setName("Rahim");
        e2.setDept("HR");

        Emp e3 = new Emp();
        e3.setId(103);
        e3.setName("Sara");
        e3.setDept("Finance");

        list.add(e1);
        list.add(e2);
        list.add(e3);

        return list;
    }

    public static void main(String[] args) {

        EmpSet obj = new EmpSet();
        List<Emp> empList = obj.addEmployees();

        System.out.println(empList);
    }
}
