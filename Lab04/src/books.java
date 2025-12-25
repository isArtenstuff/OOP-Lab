/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class books {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Java Programming";
        book1.price = 450;
        book1.publisher = "Head First";
        book1.yearPublished = 2006;
        book1.isAvailable = false;
        book1.author = "John Smith";
        
        Book book2 = new Book();
        book2.title = "Python Programming";
        book2.price = 225;
        book2.publisher = "KM";
        book2.yearPublished = 2020;
        book2.isAvailable = true;
        book2.author = "Elon Potter";
        
        /*For check Book's class*/
//        book1.printDetails();
//        System.out.println("-------------");
//        book1.updatePrice(250);
//        book1.markAsAvailable();
//        book1.printDetails();
//        System.out.println(book1.isPublishedAfter(2000));
        
        /*For check Library's class*/
        Library lib = new Library();
        lib.libraryName = "IT Library";
        lib.addBook(book2, 1);
        lib.addBook(book1, 3);
        
        lib.updateBookPrice(2, 1000);
        lib.updateBookPrice(3, 320);
        
        lib.printLibraryDetails();         
    }    
}
class Book{
    public String title, author, publisher;
    public int yearPublished;
    public double price;
    public boolean isAvailable;
    
    public void printDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: " + price);
        if (isAvailable == true){
            System.out.println("Available: Yes");
        } else{
            System.out.println("Available: No");
        }
    }
    
    public void updatePrice(double newPrice){
        price = newPrice;
    }
    
    public void markAsUnavailable(){
        isAvailable = false;
    }
    
    public void markAsAvailable(){
        isAvailable = true;
    }
    
    public boolean isPublishedAfter(int year){
        if (year < yearPublished){
            return true;
        } else{
            return false;
        }
    }
}

class Library{
    public String libraryName;
    public Book book1 = null;
    public Book book2 = null;
    public Book book3 = null;
    
    public void addBook(Book book, int slot){
        if (slot == 1){
            book1 = book;
        } else if (slot == 2){
            book2 = book;
        } else if (slot == 3){
            book3 = book;
        }
    }
    
    public void removeBook(int slot){
        if (slot == 1){
            book1 = null;
        } else if (slot == 2){
            book2 = null;
        } else if (slot == 3){
            book3 = null;
        }
    }
    
    public void printLibraryDetails(){
        System.out.println("Libraty: " + libraryName);
        System.out.println("");
        if (book1 != null) {
            book1.printDetails();
            System.out.println("");
        } else {
            System.out.println("No book in this slot.");
            System.out.println("");
        } if (book2 != null) {
            book2.printDetails();
            System.out.println("");
        } else {
            System.out.println("No book in this slot.");
            System.out.println("");
        } if (book3 != null) {
            book3.printDetails();
            System.out.println("");
        } else {
            System.out.println("No book in this slot.");
            System.out.println("");
        }
    }
    
    public void checkBookAvailability(int slot){
        if (slot == 1 && book1 != null){
            System.out.println(book1.title + "is available.");
        } else System.out.println(book1.title + "is not available.");
        if (slot == 2 && book2 != null){
            System.out.println(book2.title + "is available.");
        } else System.out.println(book2.title + "is not available.");
        if (slot == 3 && book3 != null){
            System.out.println(book3.title + "is available.");
        } else System.out.println(book3.title + "is not available.");
    }
    
    public void updateBookPrice(int slot, double newPrice){
        if (slot == 1 && book1 != null){
            book1.price = newPrice;
            System.out.println("Updated price of " + book1.title + " to $" + newPrice);
        } else if (slot == 2 && book2 != null){
            book2.price = newPrice;
            System.out.println("Updated price of " + book2.title + " to $" + newPrice);
        } else if (slot == 3 && book3 != null){
            book3.price = newPrice;
            System.out.println("Updated price of " + book3.title + " to $" + newPrice);
        } else System.out.println("No book in this slot.");
    }
    
    public void printBookDetails(Book book){
        if (book != null){
            book.printDetails();
        } else System.out.println("No book in this slot.");
    }
}