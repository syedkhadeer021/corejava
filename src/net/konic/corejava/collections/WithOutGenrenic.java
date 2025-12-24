package net.konic.corejava.collections;

import java.util.LinkedList;
import java.util.List;

public class WithOutGenrenic {
public static void main(String[] args) {
	List list = new LinkedList();
	list.add(1);
	list.add("syed khadeer");
	list.add(2.5);
	list.add('k');
	System.out.println("list "+list);
}
}
