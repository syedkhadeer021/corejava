package net.konic.corejava.String;

public class Remove {
	public static void main(String[] args) {

        String input = "Konic@2025!";
        System.out.println("Output: " + input.replaceAll("[^a-zA-Z0-9]", ""));
    }
}
