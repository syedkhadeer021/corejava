package net.konic.corejava.collections;

import java.util.LinkedList;
import java.util.List;

public class ListLaptop<E> {
	List<Laptop> addlistlaptop(){
		Laptop l = new Laptop();
		l.setName("HP");
		l.setRam(8);
		l.setPrice(45000.25);
		
		Laptop l2 =new Laptop();
		l2.setName("Dell");
		l2.setRam(6);
		l2.setPrice(40000.25);
		List list = new LinkedList<E>();
				list.add(l);
				list.add(l2);
		return list;
		
	}
	

	
	
	public static void main(String[] args) {
		
		ListLaptop laptop = new ListLaptop();
		List<Laptop> l = laptop.addlistlaptop();
		System.out.println(l);
	}

}
