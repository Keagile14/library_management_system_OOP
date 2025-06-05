package system;

public class Book {

    private int id;
    private String title;
    private String author;
    private boolean isAvailable;


    public Book(String title, String author,int id){
        this.title = title;
        this.author = author;
        this.id = id;
        this.isAvailable = true;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
    public int getId(){
        return id;
    }
    public boolean isAvailable(){
        return isAvailable;
    }


@Override
    public String toString(){
        return "Book id " + id + " ,Title " + title + " ,Author, " + author + " ,Available: " + isAvailable;
}


}
