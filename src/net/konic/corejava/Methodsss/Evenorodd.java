package net.konic.corejava.Methodsss;

public class Evenorodd {

	public boolean iseven(int num) {

		if (num % 2 == 0) {
			System.out.println("even");
			return true;
		} else {
			System.out.println("odd");
			return false;
		}
	}

	public static void main(String[] args) {

		Evenorodd evenorodd = new Evenorodd();

		 boolean  even =evenorodd.iseven(55);
		 System.out.println(even);

	}
}
