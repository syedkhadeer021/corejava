package net.konic.test1;

public class Library {

	    static String libraryName = "City Central Library";
	    String memberName;

	    public Library() {
	        memberName = "Guest Member";
	    }

	    public Library(String name) {
	        memberName = name;
	    }

	    public void selectBook(int id) {
	        switch(id) {
	            case 1:
	                System.out.println("Selected: Math Book");
	                break;
	            case 2:
	                System.out.println("Selected: English Book");
	                break;
	            case 3:
	                System.out.println("Selected: Science Book");
	                break;
	            case 4:
	                System.out.println("Selected: History Book");
	                break;
	            default:
	                System.out.println("Invalid Book ID!");
	        }
	    }

	    public static void main(String[] args) {

	        Library l1 = new Library();
	        System.out.println("Member: " + l1.memberName);
	        l1.selectBook(4);

	        System.out.println();

	        Library l2 = new Library("Ahmed");
	        System.out.println("Member: " + l2.memberName);
	        l2.selectBook(5);

	    }
	}


