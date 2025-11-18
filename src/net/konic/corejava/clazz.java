package net.konic.corejava;



public class clazz {
	public static void main(String[] args) {
		// input of subjects marks 
		int maths =45;
		int english =50;
		int science =30;
		
		int passmark =35;
		
		boolean result = (maths>= passmark) && (english>=passmark) && (science>=passmark);
		 boolean fail = result;
	     
		 if (result){
			  System.out.println("pass");
      }
          else {
			 System.out.println("failed");
			  if(maths<passmark) 
				  System.out.println("maths"+maths);
			  if(english<passmark)
				  System.out.println("english"+english);
			  if (science<passmark)
				  System.out.println("science"+science);
			 
		 }
		}
		
		
	}


