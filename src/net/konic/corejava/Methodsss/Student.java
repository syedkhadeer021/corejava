package net.konic.corejava.Methodsss;

public class Student {
	
	String name;
	int age;
	String clg;
	
	public void std(String s) {
		System.out.println("Name =" + name);
		System.out.println("Age  ="+ age );
		System.out.println("clg  =" + clg);
		
	}
	public static void main(String[] args) {
		
		Student std = new Student();
		std.name =" khadeer";
		std.age = 22;
		std.clg = " NECN";
		std.std("std");
	
	}


}


