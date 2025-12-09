package net.konic.corejava.ObjectsAndClazz;

 class Bikes {
	
	String brand;
	String color;
	int mileage;
	void start() {
		System.out.println("bike is start");
		System.out.println("brand ="   +   brand);
		System.out.println("color ="   +   color);
		System.out.println("mileage = " +   mileage);
		
	}

}


 public class Bike {
	public static void main(String[] args) {
		Bikes bikes = new Bikes();
		bikes.brand = " Honda";   
		bikes.color = " black";
		bikes.mileage = 65;

		bikes.start();
	}

}
