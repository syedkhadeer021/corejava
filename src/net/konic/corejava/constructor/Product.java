package net.konic.corejava.constructor;

public class Product {
	/**
	 * Product Billing (Constructor Overloading)

Input:
• Product 1 → name="Phone", price=20000
• Product 2 → default constructor (no input)

Output:
Product: Phone, Price: 20000
Product: Unknown, Price: 0

✳ Task:

Create 2 constructors: no-arg + parameterized

Display product details
	 */

    String name;
    double price;

    Product() {
        name = "Unknown";
        price = 0;
    }


    Product(String n, double p) {
        name = n;
        price = p;
    }

  
    void showProduct() {
        System.out.println("Product: " + name + ", Price: " + price);
    }

    public static void main(String[] args) {


        Product p1 = new Product("Phone", 20000);

      
        Product p2 = new Product();

        
        p1.showProduct();
        p2.showProduct();
    }
}



