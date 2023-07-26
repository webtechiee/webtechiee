package librarySystem;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Sample Book", "John Doe", 2023);
        Magazine magazine1 = new Magazine("Tech Magazine", "Tech Publications", 2023, "July Issue", 25);

        System.out.println("Book details:");
        book1.displayDetails();

        System.out.println("\nMagazine details:");
        magazine1.displayDetails();
    }
}






