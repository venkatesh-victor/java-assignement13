import java.util.Scanner;
import java.util.SplittableRandom;

class Book {
    Scanner sc = new Scanner(System.in);
    private String isbn;
    private String title;
    private String author;
    private String publication;
    private int noOfBooks;
    private int edition;

    public Scanner getSc() {
        return sc;
    }
    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublication() {
        return publication;
    }
    public void setPublication(String publication) {
        this.publication = publication;
    }
    public int getNoOfBooks() {
        return noOfBooks;
    }
    public void setNoOfBooks(int noOfBooks) {
        this.noOfBooks = noOfBooks;
    }
    public int getEdition() {
        return edition;
    }
    public void setEdition(int edition) {
        this.edition = edition;
    }

    public Book() { }

    public Book(String isbn, String title, String author, String publicaton,
                int noOfBooks, int edition)
                {
                    this.isbn = isbn;
                    this.title = title;
                    this.author = author;
                    this.publication = publicaton;
                    this.noOfBooks = noOfBooks;
                    this.edition = edition;
                }

    public void selectToUpdate(Book book) {
        while(true) {
            System.out.println("1.Update Edition\n2.Update available count.");
            System.out.println("3.Exit");
            String choice = sc.nextLine();

            switch(choice) {
                case "1": updateEdition(book); break;
                case "2": updateAvailableCount(book); break;
                case "3": System.out.println("Thanks..."); break;
                default: System.out.println("Invalid choice."); selectToUpdate(book); break;
            }

            if(choice.equals("4")) {
                break;
            }
        }
    }

    public String toString() {
        return title + " Written by " + author;
    }

    private void updateEdition(Book book) {
        System.out.println("Enter the editon to update: ");
        book.setEdition(sc.nextInt());
        sc.nextLine();
        System.out.println(book);
        System.out.println("Book edition updated.");
    }

    private void updateAvailableCount(Book book) {
        System.out.println("Enter the available count to update.");
        book.setNoOfBooks(sc.nextInt());
        sc.nextLine();
        System.out.println(book);
        System.out.println("Book available count updated.");
    } 
}

class Credentials {
    private String userName = "zsgs";
    private String password = "admin";

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}

public class BookDriver {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Book book = new Book("ISBN-001-002", "Java", "James Gosling",
            "McGraw", 5, 12);

        System.out.println(book);
        new BookDriver().chooseOption(book);
    }

    private void chooseOption(Book book) {
        System.out.println("Do you want to update book details?");
        System.out.println("Yes\nNO");
        String choice = sc.nextLine();

        if(choice.equalsIgnoreCase("yes")) {
            if(isUser()) book.selectToUpdate(book);
            else System.out.println("Invalid username or password");
        } else if(choice.equalsIgnoreCase("no")) {
            System.out.println("Thank you");
        } else {
            chooseOption(book);
        }
    }

    private boolean isUser() {
        Credentials credentials = new Credentials();
        System.out.println("Enter the userName");
        String userName = sc.nextLine();
        System.out.println("Enter the password: ");
        String password = sc.nextLine();
        return userName.equals(credentials.getUserName()) && password.equals(credentials.getPassword());
    }


}