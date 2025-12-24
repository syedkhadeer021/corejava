package net.konic.corejava.collections;

import java.util.LinkedList;

public class Custmor {
public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<String>();
	list.add("c1");
	list.add("c2");
	list.add("c3");
	System.out.println(list);
	
	list.add(0, "VIP");
	System.out.println(list);

	System.out.println(list.remove());
	list.remove(2);
	System.out.println(list);
	
	list.size();
System.out.println(list.size());	
}
}
