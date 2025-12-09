package net.konic.corejava.Methodsss;

public class Senario4 {
	public int sub (int a,int b) {
		int c = a-b;
		System.out.println("sub :" +c);
		return c;
	}
public static void main(String[] args) {
	Senario4 senario4 = new Senario4();
	senario4.sub(100,90);
}
}
