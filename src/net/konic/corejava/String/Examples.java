package net.konic.corejava.String;

public class Examples {

    public static void main(String[] args) {

        // 🔹 String (Immutable)
        String s = "KHADEER ";

        System.out.println(s + " " + s.hashCode());

        for (int i = 1; i <= 6; i++) {
            s = s + i;   // new object created every time
            System.out.println(s + " " + s.hashCode());
        }

        System.out.println("---------------");

        // 🔹 StringBuilder (Mutable)
        StringBuilder sb = new StringBuilder("SYED");

        for (int i = 1; i <= 3; i++) {
            sb.append(i);   // same object modified
            System.out.println(sb + " " + sb.hashCode());
        }
    }
}
