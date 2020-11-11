package simpleClasses.ex9;

public class Book {
    private int id;
    private String NameBook;
    private String author;
    private String publishingHouse;
    private int year;
    private int numberPages;
    private double price;
    private String bindingType;

    public Book(int id, String nameBook, String author, String publishingHouse, int year, int numberPages, double price, String bindingType) {
        this.id = id;
        NameBook = nameBook;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.numberPages = numberPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public String getNameBook() {
        return NameBook;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public double getPrice() {
        return price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameBook(String nameBook) {
        NameBook = nameBook;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public String toString() {
        return "ID number: " + id + "\nName of the book: " + NameBook +
                "\nAuthor: " + author + "\nPublishing house: " + publishingHouse +
                "\nThe year of publishing: " + year + "\nNumber of pages: "
                + numberPages + "\nPrice: " + price + "\n" + "Binding type: " + bindingType + "\n";
    }
}
