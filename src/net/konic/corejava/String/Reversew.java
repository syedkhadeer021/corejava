package net.konic.corejava.String;

public class Reversew {
	public static void main(String[] args) {

        String password = "admin";

        StringBuilder sb = new StringBuilder(password);
        sb.reverse();

        System.out.println( sb);
    }
}
