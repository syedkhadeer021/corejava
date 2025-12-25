package net.konic.corejava.encapulation;

public class StudentClazz {
	private int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		if(marks <= 100) {
			this.marks=marks;
		}
		else {
			System.out.println("Invalid Marks");
		}
	}
	public static void main(String[] args) {
		StudentClazz studentClazz = new StudentClazz();	
		studentClazz.setMarks(77);
		
	System.out.println("Marks :" + studentClazz.getMarks());
	}

}
