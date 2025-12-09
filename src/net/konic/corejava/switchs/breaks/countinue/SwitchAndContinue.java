package net.konic.corejava.switchs.breaks.countinue;

public class SwitchAndContinue {
	public static void main(String[] args) {
		System.out.println("ODD NUMBERS ARE:");
		
		   for(int i = 0; i <= 10; i++) {

	            if(i % 2 == 0) {
	                continue;  
	            }

	            switch(i) {
	                
	                default:
	                    System.out.println(i + " → ODD NUMBER");
	            }
	        }
	}

}
