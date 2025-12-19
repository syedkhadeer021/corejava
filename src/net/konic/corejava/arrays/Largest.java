package net.konic.corejava.arrays;

public class Largest {
	    public static void main(String[] args) {

	        int[] arr = {45, 22, 89, 10};

	        int largest = arr[0];

	        if (arr[1] > largest) {
	            largest = arr[1];
	        }
	        if (arr[2] > largest) {
	            largest = arr[2];
	        }
	        if (arr[3] > largest) {
	            largest = arr[3];
	        }

	        System.out.println(largest);
	    }
	}


