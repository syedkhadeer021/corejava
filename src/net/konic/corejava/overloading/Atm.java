package net.konic.corejava.overloading;

public class Atm {
	void draw (int x) {
		System.out.println("WithDraw : ₹" +x);
	}
	double draw (double x) {
		System.out.println("withDraw : ₹" +x);
		return x;
	}
	void draw (int x,String y) {
		System.out.println("WithDraw : ₹" +x +y);
	}
public static void main(String[] args) {
	Atm atm = new Atm();
	atm.draw(500);
	atm.draw(500.75);
	atm.draw(1000, " Current");
	
}
}
