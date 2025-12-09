package net.konic.corejava.overloading;

public class Calcl {
	int add (int x,int y) {
		System.out.println(x+y);
	return x+y;
		
	}
	String add(String x,String y) {
		System.out.println(x+y);
		return x + y;
		}
	void add (int x,int y,int z) {
		System.out.println(x+","+y+","+z);
	}
	public static void main(String[] args) {
		Calcl calcl = new Calcl();
		calcl.add(5, 7);
		calcl.add("khadeer ", "syed");
		calcl.add(3,33, 333);
		
	}

}
