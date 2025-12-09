package net.konic.corejava.switchs.breaks.countinue;

public class Conutine2 {
	public static void main(String[] args) {

		int[] numbers = { 10, -5, 8, -2, 7 };

		for (int num : numbers) {

			if (num < 0) {
				continue;
			}

			System.out.println(num);
		}
	}

}
