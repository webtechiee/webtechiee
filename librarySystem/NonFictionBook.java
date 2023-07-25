package librarySystem;

public class NonFictionBook extends Book{
	String setting;
	
	public NonFictionBook(String title, String author, int yearPublished,String setting) {
		super(title, author, yearPublished);
		this.setting = setting;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("The setting is " + setting);
	
	}
	
}
