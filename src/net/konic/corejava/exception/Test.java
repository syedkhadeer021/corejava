package net.konic.corejava.exception;

public class Test {
	public static void check(int n) {
		if(n==0) {
			throw new NumberException("Number is Zero");
		}
		System.out.println("Number is not zero");
	}
public static void main(String[] args) {
	check(0);
}
}
