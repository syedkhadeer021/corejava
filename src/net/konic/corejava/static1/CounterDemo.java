package net.konic.corejava.static1;

public class CounterDemo {
	/**
	 * Create a class CounterDemo • static variable: count • Constructor increases
	 * count Task: Create 3 objects and print final count = 3
	 * 
	 * 
	 */
	static int count = 0;

	CounterDemo() {
		count++;
	}

	public static void main(String[] args) {

		CounterDemo c1 = new CounterDemo();
		CounterDemo c2 = new CounterDemo();
		CounterDemo c3 = new CounterDemo();
		CounterDemo c4 = new CounterDemo();
		
		System.out.println("Final Count = " + CounterDemo.count);
	}
}
