package net.konic.corejava.Methods2;

public class StudentMarks {

	    int marks;
	    public void setMarks(int m) {
	        marks = m;
	    }
	    public String checkResult() {

	        if (marks >= 35) {
	            return "Pass";
	        } else {
	            return "Fail";
	        }
	    }

	    public static void main(String[] args) {

	        StudentMarks studentmarks = new StudentMarks();

	        studentmarks.setMarks(33);

	        String result = studentmarks.checkResult(); 

	        System.out.println("Result: " + result);
	    }
	}



