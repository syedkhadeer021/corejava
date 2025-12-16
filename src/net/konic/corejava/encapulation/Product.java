package net.konic.corejava.encapulation;

public class Product {

    private double price;

    // Setter
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = -1;   // invalid price marker
        }
    }

    // Getter
    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {

        Product p = new Product();

        double inputPrice = 500;   // change to -500 to test

        p.setPrice(inputPrice);

        if (p.getPrice() == -1) {
            System.out.println("Invalid price");
        } else {
            System.out.println("Price: " + p.getPrice());
        }
    }
}
