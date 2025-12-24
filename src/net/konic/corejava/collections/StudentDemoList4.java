package net.konic.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class StudentDemoList4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Ayaan");
		list.add("Rahim");
		list.add("Sara");
		list.add("John");
		list.add("Ali");
		if (list.contains("john"))
			;
		{
			System.out.println("found");
		}
	}
}
