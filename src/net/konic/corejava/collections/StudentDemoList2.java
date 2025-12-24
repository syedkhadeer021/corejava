package net.konic.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class StudentDemoList2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ayaan");
        list.add("Rahim");
        list.add("Sara");
        list.add("John");
        list.add("Ali");

        int index = 2;
        System.out.println(list.get(index));
    }
}
