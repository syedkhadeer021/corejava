package net.konic.corejava.arrays;

public class CountOccernce {
	    public static void main(String[] args) {

	        int[] arr = {2, 3, 2, 4, 2};
	        int element = 2;
	        int count = 0;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == element) {
	                count++;
	            }
	        }

	        System.out.println(count);
	    }
	}


