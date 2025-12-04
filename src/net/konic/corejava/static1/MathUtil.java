package net.konic.corejava.static1;

public class MathUtil {
	/**
	 * Create a class MathUtil • static method: add(a,b) • instance method:
	 * multiply(a,b) Task: Try calling both from main() and observe: ✔ static method
	 * works directly ✔ non-static requires object
	 * 
	 * 
	 * ---
	 * 
	 */
	    public static int add(int a, int b) {
	        return a + b;
	    }

	    public int multiply(int a, int b) {
	        return a * b;
	    }

	    public static void main(String[] args) {

	        int add = MathUtil.add(10, 20);
	        System.out.println("Sum = " + add);
	        
	        MathUtil math = new MathUtil();
	        int product = math.multiply(5, 4);
	        System.out.println("Product = " + product);
	    }
	}


