package net.konic.test1;

public class Recharge {
	/**
	 * Mobile Recharge System
	 * 
	 * Task: Class Recharge:
	 * 
	 * static method → showOperator()
	 * 
	 * public constructor → set mobile number
	 * 
	 * non-static method → choosePlan(int planCode) using switch
	 * 
	 * private constructor → block outside creation
	 * 
	 * 
	 * Input: planCode = 2 Output: 2GB/day – 28 days
	 * 
	 * 
	 */

	    long mobileNumber;

	    public Recharge(long number) {
	        mobileNumber = number;
	    }

	    private Recharge() {}

	    public static void showOperator() {
	        System.out.println("Available Operators:");
	        System.out.println("1. Jio");
	        System.out.println("2. Airtel");
	        System.out.println("3. VI");
	    }

	    public void choosePlan(int planCode) {
	        switch(planCode) {
	            case 1:
	                System.out.println("1.5GB/day – 28 days");
	                break;
	            case 2:
	                System.out.println("2GB/day – 28 days");
	                break;
	            case 3:
	                System.out.println("1GB/day – 56 days");
	                break;
	            default:
	                System.out.println("Invalid Plan Code!");
	        }
	    }


	    public static void main(String[] args) {

	        Recharge.showOperator();   // static call

	        Recharge r = new Recharge(987654321);
	        System.out.println("Mobile: " + r.mobileNumber);

	        r.choosePlan(2);
	    }
	}


