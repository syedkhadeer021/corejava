package net.konic.corejava.arrays;

public class Search {
	    public static void main(String[] args) {

	        int[] arr = {5, 10, 15, 20};
	        int search = 15;
	        boolean found = false;

	        for (int num : arr) {
	            if (num == search) {
	                found = true;
	                break;
	            }
	        }

	        if (found)
	            System.out.println("Element Found");
	        else
	            System.out.println("Element Not Found");
	    }
	}


