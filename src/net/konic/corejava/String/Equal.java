package net.konic.corejava.String;

public class Equal {
	public static void main(String[] args) {

        String s1 = "admin";
        String s2 = new String("admin");

        System.out.println(s1=s2);
        System.out.println( s1.equals(s2));
    }
}


