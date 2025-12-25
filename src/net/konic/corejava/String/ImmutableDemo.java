package net.konic.corejava.String;

public class ImmutableDemo {

    public static void main(String[] args) {

        String name = "syed";

        System.out.println(name.hashCode());
        System.out.println(name);
        System.out.println("name : " + name + " hashcode: " + name.hashCode());

        name.concat(" Khadeer Ahmed"); // no reassignment
        System.out.println(name); // unchanged
    }
}
