package net.konic.corejava.overloading;

public class MarksCalculator {
/**
 *  Marks Calculator – Overloading
QUESTION:

Overload calculateMarks() for 1 subject, 2 subjects, 3 subjects.

INPUT:
calculateMarks(80)
calculateMarks(80, 90)
calculateMarks(80, 90, 85)

OUTPUT:
Total Marks: 80
Total Marks: 170
Total Marks: 255
 * 
 */

	    void calculateMarks(int a) {
	        System.out.println("Total Marks: " + a);
	    }

	    
	    void calculateMarks(int a, int b) {
	        System.out.println("Total Marks: " + (a + b));
	    }

	   
	    void calculateMarks(int a, int b, int c) {
	        System.out.println("Total Marks: " + (a + b + c));
	    }

	    public static void main(String[] args) {

	        MarksCalculator m = new MarksCalculator();

	        m.calculateMarks(80);
	        m.calculateMarks(80, 90);
	        m.calculateMarks(80, 90, 85);
	    }
	}


