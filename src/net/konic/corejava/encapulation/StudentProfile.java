package net.konic.corejava.encapulation;

public class StudentProfile {

	    private int age;

	    // Setter
	    public void setAge(int age) {
	        if (age >= 5 && age <= 100) {
	            this.age = age;
	        } else {
	            this.age = -1;   // invalid marker
	        }
	    }

	    // Getter
	    public int getAge() {
	        return age;
	    }

	    public static void main(String[] args) {

	        StudentProfile s = new StudentProfile();

	        // Input
	        int inputAge = 3;

	        s.setAge(inputAge);

	        if (s.getAge() == -1) {
	            System.out.println("Invalid age");
	        } else {
	            System.out.println("Age: " + s.getAge());
	        }
	    }
	

    }




