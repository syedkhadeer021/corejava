package net.konic.corejava.Methodsss;

public class Cal {
	public int add(int a, int b) {
		int c=a+b;
		System.out.println("add  "+ c);
		return a + b;
	
	}

	public int sub(int a, int b) {
		int d = a-b;
		System.out.println("sub  "+d );
		return a - b;
	}

	public int mul(int a, int b) {
		int e = a*b;
		System.out.println("mul  "+e );
		return a * b;

	}

	public float div(float x, float y) {
		float f = x/y;
		System.out.println("div "+ f );
		return x / y;
	}

	public static void main(String[] args) {
		Cal cal = new Cal();
		cal.add(2, 5);
		int x = cal.sub(2, 5);
		cal.mul(2, 4);
		cal.div(19, 30);

	}
}