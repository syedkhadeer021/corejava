package net.konic.corejava.Methodsss;

public class Name {
	public String checkName(String firstName, String lastName) {

        
        String fullName = firstName + " " + lastName;

        if (fullName.length() >= 10) {
            return "Long Name";
        } else {
            return "Short Name";
        }
    }

    public static void main(String[] args) {

        Name name = new Name();

     String result = name.checkName("khadeer","ahmed");

        System.out.println(result);
    }
	}


