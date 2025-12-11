package net.konic.corejava.hasa;

class PaymentDetails {
 String method;
 double amount;
}
class Order {
 PaymentDetails payment; 

 void displaySummary() {
     System.out.println("Order Placed Successfully");
     System.out.println("Payment Method: " + payment.method);
     System.out.println("Amount: " + payment.amount);
 }
}

public class OrderDemo {
 public static void main(String[] args) {

     Order order = new Order();
     order.payment = new PaymentDetails();

     order.payment.method = "UPI";
     order.payment.amount = 550.00;

     order.displaySummary();
 }
}
