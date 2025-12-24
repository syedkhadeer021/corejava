package net.konic.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class ProductList2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        int index = 3;
        System.out.println(list.get(index));
    }
}
