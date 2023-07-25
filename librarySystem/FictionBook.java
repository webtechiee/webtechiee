package librarySystem;

public class FictionBook extends Book {
	String genre;
	
	public FictionBook(String title, String author, int yearPublished,String genre) {
		super(title, author, yearPublished);
		this.genre = genre;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	 public void displayDetails() {
		 super.displayDetails();
		 System.out.println("The genre of the book is " + genre);
		 
	 }
	
	
}
