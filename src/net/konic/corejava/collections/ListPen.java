package net.konic.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class ListPen {

	List<Pen> addlistpen() {
		Pen p = new Pen();
		p.setName("Cello");
		p.setColour("Bule");
		p.setPrice(5);

		Pen p2 = new Pen();
		p2.setName("Meow");
		p2.setColour("Black");
		p2.setPrice(6);

		List list = new ArrayList<>();
		list.add(p);
		list.add(p2);

		return list;

	}

	public static void main(String[] args) {
		ListPen listPen=new ListPen();
		List<Pen> output=listPen.addlistpen();
		System.out.println(output);
	}
}
