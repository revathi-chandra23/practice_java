package OOPs;

import java.util.ArrayList;

//11. Write a Java program to create a class called "Library" with a collection of books and
// methods to add and remove books.
class Library
{
private ArrayList books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public ArrayList getBooks() {
        return books;
    }
    public void addBooks(String addb)
    {
        books.add(addb);
    }
    public void removeBooks(String addb)
    {
        books.remove(addb);
    }
}

public class Oops11 {
    public static void main(String[] args) {
        Library l=new Library();
        l.addBooks("java the edition 1");
        l.addBooks("python");
        l.addBooks("I too have a love story");
        l.addBooks("being alone");
        System.out.println("the collection of books in library: "+l.getBooks());
        l.removeBooks("java the edition 1");
        System.out.println("the remaining books in library: "+l.getBooks());


    }
}
