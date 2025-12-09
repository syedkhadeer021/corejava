package net.konic.corejava.Methodsss;

public class Senario6 {
	public boolean age(int a) {
	
		
		System.out.println("age" +a);
		if(a>=18) {
			System.out.println("eligble");
			return true;
			
		}
		else {
			System.out.println("not eligble");
			return false;
		}
			
	}
	public static void main(String[] args) {
		Senario6 senario6 = new Senario6();
		senario6.age(14);
	
	}
	

}
