package net.konic.corejava.exception;

public class Multiple {
	public static void main(String[] args) {
		try {
			int a = 10;
			System.out.println(a);
			int b = 20;
			System.out.println(b);
			int c = 30;
			System.out.println(c);
			try {
				System.out.println("Hello");
				System.out.println("world");
				String s = null;
				System.out.println(s.length());

			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("Goblal Neon chain");
			} finally {
				System.out.println("This should Print");
			}
			int d = 25;
			System.out.println(d);
		} catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println("the error");
		} finally {
			System.out.println("block 11");
		}
		System.out.println("Block 12");
	}
}