package librarySystem;

public class Book {
	String title;
	String author;
	 int yearPublished;
	  
	 public Book(String title,String author,int yearPublished) {
	 this.title = title;
	 this.author = author;
	 this.yearPublished = yearPublished;
	 }
	 
	 
	 
 public void displayDetails() {
	 System.out.println("The title of the book is " + title);
	 System.out.println("The author of the book is " + author);
	 System.out.println("The book was published in " + yearPublished);
	 
 }
 }
