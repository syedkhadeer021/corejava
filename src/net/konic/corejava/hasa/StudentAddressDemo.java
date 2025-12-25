package net.konic.corejava.hasa;

class Address {
 String city;
 int pincode;
}

class Student {
 String name;
 Address address; 
}

public class StudentAddressDemo {
 public static void main(String[] args) {

     Student s = new Student();
     s.address = new Address();

     s.name = "Ahmed";
     s.address.city = "Hyderabad";
     s.address.pincode = 500001;

     // Printing output
     System.out.println("Student: " + s.name);
     System.out.println("Address: " + s.address.city + " - " + s.address.pincode);
 }
}
