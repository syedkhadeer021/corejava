package net.konic.corejava.String;

public class Invoice {

    public static void main(String[] args) {

        String message = "Invoice Generated";
        int number = 101;

        StringBuilder sb = new StringBuilder(message);

        sb.insert(7, " " + number);

        System.out.println(sb);
    }

}
