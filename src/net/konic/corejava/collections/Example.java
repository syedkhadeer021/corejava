package net.konic.corejava.collections;

import java.util.LinkedList;
import java.util.List;

public class Example {
	public static void main(String[] args) {
	List list = new LinkedList();
	list.add(1);
	list.add("khadeer");
	list.add(null);
	list.add(120);
	
	System.out.println(list);
	//insertion
	list.set(2, 30);
	System.out.println(list);
	//remove
	list.remove(3);
	System.out.println(list);
	//update
list.size();
System.out.println(list.size());
	
	}

}
