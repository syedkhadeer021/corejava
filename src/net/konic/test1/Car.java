package net.konic.test1;

public class Car {
	
	String brand;
	String colour;
	String type;
	int price;
	
	Car (String x, String y,String z, int m){
	  brand = x;
	  colour =y;
	  type = z;
	  price = m;
	  
	}

	public void details() {
		 System.out.println("barnd:"+brand);
		 System.out.println("colour:"+colour);
		 System.out.println("type:"+type);
		 System.out.println("price:"+price);
	}
		 public static void main(String[] args) {
			 Car car = new Car("TOYOTA","RED","PETROL",1500000);
			 car.details();
		 
		 
		 }
	}

