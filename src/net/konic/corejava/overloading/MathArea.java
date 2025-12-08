package net.konic.corejava.overloading;

public class MathArea {
	/**
	 * Calculate Area (Math Application)
QUESTION:

Use one method name area() for square, rectangle, and circle.

INPUT:
area(5)
area(5, 10)
area(3.14, 7)   // assume circle area

OUTPUT:
Area of square: 25
Area of rectangle: 50
Area of circle: 21.98

	 */
	

	    void area(int side) {
	        int result = side * side;
	        System.out.println("Area of square: " + result);
	    }

	    void area(int length, int width) {
	        int result = length * width;
	        System.out.println("Area of rectangle: " + result);
	    }

	    void area(double pi, int radius) {
	        double result = pi * radius * radius;
	        System.out.println("Area of circle: " + result);
	    }

	    public static void main(String[] args) {

	        MathArea m = new MathArea();

	        m.area(5);
	        m.area(5, 10);
	        m.area(3.14, 7);
	    }
	}


