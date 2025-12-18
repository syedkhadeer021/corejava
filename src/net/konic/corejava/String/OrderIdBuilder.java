package net.konic.corejava.String;

public class OrderIdBuilder {   // class name changed

    public static void main(String[] args) {

        String base = "ORD";
        int number = 1001;

        StringBuilder orderId = new StringBuilder(base);
        orderId.append(number);

        System.out.println("Order ID: " + orderId);
    }
}
