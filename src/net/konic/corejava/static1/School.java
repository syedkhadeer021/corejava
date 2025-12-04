package net.konic.corejava.static1;

public class School {
	/**
	 * reate a class School • instance method: printStudent() • static method:
	 * printSchoolName() Task: Call static method first (without object), then call
	 * instance method using object.
	 * 
	 * 
	 * 
	 */
	    public void printStudent(String studentName) {
	        System.out.println("Student Name: " + studentName);
	    }

	    public static void printSchoolName() {
	        System.out.println("School Name: Little Angels High School");
	    }

	    public static void main(String[] args) {

	        School.printSchoolName();

	        School s = new School();

	        s.printStudent("Khadeer Ahmed");
	    }
	}


