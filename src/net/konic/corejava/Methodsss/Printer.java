package net.konic.corejava.Methodsss;

public class Printer {
	public void name(String firstname,String lastname) {
		String c = firstname + lastname;
		System.out.println("Name =" +c);
	}
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.name(" khadeer ", "syed");
		
	}

}
