package net.konic.corejava.inheritance;

public class Student1 extends Person {
	
	    int rollNo;


	    public static void main(String[] args) {

	        Student1 s = new Student1();

	        s.name = "Rahul";
	        s.age = 20;
	        s.rollNo = 101;

	        System.out.println("Name: " + s.name);
	        System.out.println("Age: " + s.age);
	        System.out.println("Roll No: " + s.rollNo);
	    }
	}


