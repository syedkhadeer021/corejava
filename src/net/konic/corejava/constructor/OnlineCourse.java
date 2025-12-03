package net.konic.corejava.constructor;

public class OnlineCourse {
	/**
	 * Online Course Enrollment (All Concepts)
	 * 
	 * Input: Student="Akila", Course="Java", Fee=15000
	 * 
	 * Output: Akila Enrolled Course: Java Fee: 15000 Platform: Udemy
	 * 
	 * ✳ Task:
	 * 
	 * Constructor: set student name
	 * 
	 * Parameterized constructor for course details
	 * 
	 * Static variable platformName
	 * 
	 * Static method changePlatform()
	 */
	static String platformName = "Udemy";

	String student;
	String course;
	int fee;

	static void changePlatform(String newPlatform) {
		platformName = newPlatform;
	}

	OnlineCourse(String s) {
		student = s;
	}

	OnlineCourse(String s, String c, int f) {
		student = s;
		course = c;
		fee = f;
	}

	void showDetails() {
		System.out.println(student + " Enrolled");
		System.out.println("Course: " + course);
		System.out.println("Fee: " + fee);
		System.out.println("Platform: " + platformName);
	}

	public static void main(String[] args) {

		OnlineCourse oc = new OnlineCourse("Akila", "Java", 15000);

		oc.showDetails();
	}
}
