package librarySystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Book fictionBook = new FictionBook("The Secret Garden","Frances Hodgson Burnett",1911,"Fantasy");
	Book nonfictionBook = new NonFictionBook("Sapiens:A Brief Of HumanKind","Yuval Noah Harari",2014,"History");
	Book referenceBook = new ReferenceBook("The Complete Reference","Herbert Schildt",2019,"English");
		
		
		
		System.out.println("DETAILS OF THE FICTION BOOK:" );
		fictionBook.displayDetails();
		
		System.out.println("\nDETAILS OF THE NON-FICTION BOOK:");
		nonfictionBook.displayDetails();
		
		System.out.println("\nDETAILS OF THE REFERENCE BOOK BOOK:");
		referenceBook.displayDetails();
	}

}
