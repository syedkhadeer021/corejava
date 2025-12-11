package net.konic.corejava.isas;

class LivingBeing {
 void breathe() {
     System.out.println("Breathing...");
 }
}

class Animal extends LivingBeing {
 void sound() {
     System.out.println("Animal makes a sound");
 }
}
class Dog extends Animal {
 
 void sound() {
     System.out.println("Dog barks");
 }
}

public class LivingBeingDemo {
 public static void main(String[] args) {

     Dog d = new Dog();

     d.breathe(); 
     d.sound();   
 }
}
