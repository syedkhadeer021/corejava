package net.konic.corejava.collections;

public class Pen {
	private String name;
	private String colour;
	private int price;
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Pen [name=" + name + ", colour=" + colour + ", price=" + price + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
