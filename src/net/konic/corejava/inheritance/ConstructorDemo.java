package net.konic.corejava.inheritance;
class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor");
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Child c = new Child();
    }
}

