package net.konic.corejava.constructor;

public class Student {

/**
 * College Student (Static Method + Constructor)

Input: collegeName=“IIT Delhi”, student=("Zara",12)
Output:
College Name: IIT Delhi
Student: Zara
Roll No: 12

✳ Task:

Static method changeCollege()

Constructor sets name & rollNo


 */

	    static String collegeName = "Default College";

	    String name;
	    int rollNo;

	    static void changeCollege(String newCollege) {
	        collegeName = newCollege;
	    }

	   
	    Student(String n, int r) {
	        name = n;
	        rollNo = r;
	    }

	  
	    void showDetails() {
	        System.out.println("College Name: " + collegeName);
	        System.out.println("Student: " + name);
	        System.out.println("Roll No: " + rollNo);
	    }

	    public static void main(String[] args) {


	        changeCollege("IIT Delhi");

	 
	        Student s1 = new Student("Zara", 12);

	        s1.showDetails();
	    }
	}


