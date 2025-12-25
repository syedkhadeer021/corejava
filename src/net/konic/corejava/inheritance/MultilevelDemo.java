package net.konic.corejava.inheritance;

class A {
 void a() {
     System.out.println("A method");
 }
}


class B extends A {
 void b() {
     System.out.println("B method");
 }
}


class C extends B {
 void c() {
     System.out.println("C method");
 }
}

public class MultilevelDemo {
 public static void main(String[] args) {

     C obj = new C();

     obj.a();  
     obj.b();  
     obj.c();  
 }
}




