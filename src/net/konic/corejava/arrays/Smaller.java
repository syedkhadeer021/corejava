package net.konic.corejava.arrays;

public class Smaller {
	    public static void main(String[] args) {

	        int[] arr = {45, 22, 89, 10};

	        int smallest = arr[0];

	        if (arr[1] < smallest) {
	            smallest = arr[1];
	        }
	        if (arr[2] < smallest) {
	            smallest = arr[2];
	        }
	        if (arr[3] < smallest) {
	            smallest = arr[3];
	        }

	        System.out.println(smallest);
	    }
	}


