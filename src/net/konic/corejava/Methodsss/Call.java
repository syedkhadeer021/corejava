package net.konic.corejava.Methodsss;

public class Call {
public int add (int a, int b) {
	
	int c=a+b;
	System.out.println(+c);
	return c;
}
public static void main(String[] args) {
	Call call = new Call();
	call.add(10, 20);
}
}
