package net.konic.corejava.Methods2;

public class Rectangle {
	/**
	 * Area of Rectangle
	 * 
	 * Instance variables: length, width
	 * 
	 * Method setDimensions(int l, int w)
	 * 
	 * Method getArea() → returns area
	 * 
	 * Print result from main.
	 * 
	 * 
	 */
	 int length; 
	    int width;    

	    public void setDimensions(int l, int w) {
	        length = l;
	        width = w;
	    }
	    public int getArea() {
	        return length * width;
	    }

	    public static void main(String[] args) {

	        Rectangle rectangle = new Rectangle();  

	        rectangle.setDimensions(10, 5);  

	        int area = rectangle.getArea();  

	        System.out.println("Area of Rectangle = " + area);
	    }
	}

	
	
	

