package librarySystem;

public class ReferenceBook extends Book{
	String language;
	
	public ReferenceBook(String title, String author, int yearPublished,String language) {
		super(title, author, yearPublished);
		this.language = language;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("The number of language is " + language );
	
	}

}
