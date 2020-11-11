package simpleClasses.ex9;

import Decomposition.A;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(100, "Lolita", "Vladimir Nabokov", "PENGUIN RANDOM HOUSE",
                1989, 336, 35.55, "paperback");
        Book book2 = new Book(120, "The Wind-Up Bird Chronicle", "Haruki Murakami", "PENGUIN RANDOM HOUSE",
                1998, 624, 20.55, "paperback");
        Book book3 = new Book(250, "Anna Karenina", "Leo Tolstoy", " Wordsworth Editions Ltd",
                2010, 848, 35.55, "hardcover");
        Book book4 = new Book(324, "War and Peace", "Leo Tolstoy", "Dover Publications",
                2014, 1152, 45.00, "paperback");
        Book book5 = new Book(111, "Kafka on the Shore", "Haruki Murakami", "PENGUIN RANDOM HOUSE",
                2006, 480, 15.99, "hardcover");
        BookCatalog bookCatalog = new BookCatalog();
        bookCatalog.addBook(book1);
        bookCatalog.addBook(book2);
        bookCatalog.addBook(book3);
        bookCatalog.addBook(book4);
        bookCatalog.addBook(book5);

        System.out.println("List of all books: " + "\n");
        bookCatalog.printList(bookCatalog.getBookArrayList());
        System.out.println(" ");

        String author = "Haruki Murakami";
        System.out.println("List of books by one author: " + author +"\n");
        ArrayList<Book> booksByAuthor = bookCatalog.getListOfBooksByAuthor(author);
        bookCatalog.printList(booksByAuthor);
        System.out.println("");

        String publisher = "PENGUIN RANDOM HOUSE";
        System.out.println("List of books by publisher: " + publisher +  "\n");
        ArrayList<Book> booksByPublisher = bookCatalog.getListOfBooksByPublishingHouse(publisher);
        bookCatalog.printList(booksByPublisher);

        int year = 2007;
        System.out.println("list of books released after a given year: " + year + "\n");
        ArrayList<Book> booksByYear = bookCatalog.getListOfBookAfterGivenYear(year);
        bookCatalog.printList(booksByYear);
    }
}