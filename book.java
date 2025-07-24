// Define the Book class
public class Book {
    // Fields (attributes)
    String title;
    String author;
    int pages;

    // Constructor
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Method to display book info
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }

    // Main method
    public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 208);
        Book book2 = new Book("1984", "George Orwell", 328);

        // Display info for each book
        System.out.println("Book 1:");
        book1.displayBookInfo();

        System.out.println("\nBook 2:");
        book2.displayBookInfo();
    }
}
