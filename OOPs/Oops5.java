package OOPs;
//5. Write a Java program to create a class called "Book" with
// attributes for title, author, and ISBN, and methods to add and remove books
// from a collection.
import  java.util.ArrayList;
class Book
{
    String title;
    String author;
    int  ISBN;
    static ArrayList<Book> list=new ArrayList<Book>();
    public Book(String title,
    String author,
    int  ISBN)
    {
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
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

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public static void add_book(Book book) {
        list.add(book);

        }

    public static void remove_book(Book book) {
        list.remove(book);

    }
    public static ArrayList<Book> BookCollection() {
        // Return the bookCollection ArrayList
        return list;
    }
}
public class Oops5 {
    public static void main(String[] args) {
        Book b=new Book("rose","rossy",325);
        Book b1=new Book("sunwaves","suraj",1325);
        Book b2=new Book("rainbowe","ramya",10925);
        Book b3=new Book("implusion","jesssy",8332);
        System.out.println("name of the book:"+b.getTitle()+", author of the book:"+b.getAuthor()+", ISBN:"+b.getISBN());
        System.out.println("name of the book:"+b1.getTitle()+", author of the book:"+b1.getAuthor()+", ISBN:"+b1.getISBN());
        System.out.println("name of the book:"+b2.getTitle()+", author of the book:"+b2.getAuthor()+", ISBN:"+b2.getISBN());
        System.out.println("name of the book:"+b3.getTitle()+", author of the book:"+b3.getAuthor()+", ISBN:"+b3.getISBN());
        Book.add_book(b1);
        // Add book2 to the book collection
        Book.add_book(b2);

        // Retrieve the book collection and store it in an ArrayList named bookCollection
        ArrayList<Book> bookCollection = Book.BookCollection();

        // Print a heading for the list of books
        System.out.println("List of books:");

        // Iterate over each book in the bookCollection
        for (Book book : bookCollection) {
            // Print the title, author, and ISBN of each book
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }

        // Remove book1 from the book collection
        Book.remove_book(b1);

        // Print a message indicating that book1 has been removed
        System.out.println("\nAfter removing " + b1.getTitle() + ":");

        // Print a heading for the updated list of books
        System.out.println("List of books:");

        // Iterate over each book in the bookCollection
        for (Book book : bookCollection) {
            // Print the title, author, and ISBN of each book
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }

    }
}
