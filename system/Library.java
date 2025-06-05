package system;

import java.util.ArrayList;
import java.util.Objects;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title, String author,int id){
        Book newBook = new Book(title,author,id);
        books.add(newBook);
        System.out.println("booked added: " + title);
    }

    public Book searchBookByTitle(String title){
        for (Book b : books){
            if (b.getTitle().equalsIgnoreCase(title)){
                return b;
            }
        }
        return null;
    }

   public void listBook(){
        if (books.isEmpty()){
            System.out.println("No books found");
        }else {
            System.out.println("Book list: ");
            for (Book b : books){
                System.out.println(b);
            }
        }
   }
}
