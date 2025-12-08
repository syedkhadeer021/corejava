package net.konic.corejava.overloading;

public class OnlineShopping {
	void addtocart(int x) {
		System.out.println("Product " +x +" add to cart");
	}
	void addtocart(int x,int y) {
		System.out.println("product " +x +" add with quantity " +y );
	}
	String addtocart(String z) {
		System.out.println(z +"added to cart");
		return z;
	}
	public static void main(String[] args) {
		OnlineShopping op = new OnlineShopping();
		op.addtocart(101);
		op.addtocart(101, 3);
		op.addtocart("Ear phone");
		
	}

}
