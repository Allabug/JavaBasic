package simpleClasses.ex9;

import Decomposition.A;
import simpleClasses.ex8.Customer;

import java.util.ArrayList;

public class BookCatalog {

    private ArrayList<Book> bookArrayList;

    public BookCatalog() {
        ArrayList<Book> bookArrayList = new ArrayList<>();
        this.bookArrayList = bookArrayList;
    }

    public ArrayList<Book> getBookArrayList() {
        return bookArrayList;
    }

    public BookCatalog addBook(Book book) {
        bookArrayList.add(book);
        return this;
    }

    public ArrayList<Book> getListOfBooksByAuthor(String authorName) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for (Book b : bookArrayList) {
            if (b.getAuthor().compareTo(authorName) == 0) {
                booksByAuthor.add(b);
            }
        }
        return booksByAuthor;
    }

    public ArrayList<Book> getListOfBooksByPublishingHouse(String publisher) {
        ArrayList<Book> booksByPublisher = new ArrayList<>();
        for (Book b : bookArrayList) {
            if (b.getPublishingHouse().compareToIgnoreCase(publisher) == 0) {
                booksByPublisher.add(b);
            }
        }
        return booksByPublisher;
    }

    public ArrayList<Book> getListOfBookAfterGivenYear(int year) {
        ArrayList<Book> booksByYear = new ArrayList<>();
        for (Book b : bookArrayList) {
            if (b.getYear() > year) {
                booksByYear.add(b);
            }
        }
        return booksByYear;
    }

    public void printList(ArrayList<Book> list) {
        for (Book b : list) {
            System.out.println(b);
        }
    }
}
