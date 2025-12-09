package net.konic.corejava.constructor;

public class Book {
	/**
	 * Library Book Issue (Copy Constructor)
	 * 
	 * Input: Book1 → title="Java", author="James" Book2 → copy of Book1
	 * 
	 * Output: Java - James Java - James (copy)
	 * 
	 * ✳ Task:
	 * 
	 * Create copy constructor (accepts same class object)
	 * 
	 */

	String title;
	String author;

	Book(String t, String a) {
		title = t;
		author = a;
	}

	Book(Book b) {
		title = b.title;
		author = b.author;
	}

	public void showBook() {
		System.out.println(title + " - " + author);
	}

	public static void main(String[] args) {

		Book book1 = new Book("Java", "James");
		Book book2 = new Book(book1);
		book1.showBook();
		book2.showBook();
	}
}
