package librarySystem;

class Magazine {
    
    private String issue;
    private int volume;
	private Publication publication;

    public Magazine(String title, String author, int yearPublished, String issue, int volume) {
        this.publication = new Publication(title, author, yearPublished);
        this.issue = issue;
        this.volume = volume;
    }

    public void displayDetails() {
        publication.displayDetails();
        System.out.println("Issue: " + issue);
        System.out.println("Volume: " + volume);
    }
}