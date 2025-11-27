package net.konic.corejava.Methodsss;

public class Vote {
	public boolean vote(int age) {
		if (age >= 18) {
			System.out.println("elgible");
			return true;
		} else {
			System.out.println("not elgible");
			return false;

		}

	}

	public static void main(String[] args) {
		Vote vote = new Vote();
		vote.vote(22);
		
		

	}

}
