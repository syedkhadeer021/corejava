package net.konic.test1;

public class Gym {
/**
 * ⿧ Fitness Gym Membership

Task:
Class Gym:

static variable gymName

public constructor → name, age

switch → choose membership type

private constructor → not allowed externally


Input: choice=1
Output: Selected: Monthly Plan (₹500)
 */
	
	    static String gymName = "Body Fitness Gym";
	    String memberName;
	    int memberAge;

	    public Gym(String name, int age) {
	        memberName = name;
	        memberAge = age;
	    }

	    private Gym() {
	        memberName = "Internal";
	        memberAge = 0;
	    }

	    public void choosePlan(int choice) {
	        switch (choice) {
	            case 1:
	                System.out.println("Selected: Monthly Plan (₹500)");
	                break;
	            case 2:
	                System.out.println("Selected: Quarterly Plan (₹1200)");
	                break;
	            case 3:
	                System.out.println("Selected: Yearly Plan (₹4000)");
	                break;
	            default:
	                System.out.println("Invalid Plan Choice!");
	        }
	    }


	    public static void main(String[] args) {

	        Gym g = new Gym("Khadeer", 22);
	        System.out.println("Member: " + g.memberName);
	        System.out.println("Age: " + g.memberAge);
	        System.out.println("Gym: " + Gym.gymName);

	        g.choosePlan(1);   
	    }
	}



