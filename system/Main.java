package system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Library library = new Library();
    Scanner scanner = new Scanner(System.in);

    while(true){

            System.out.println("\n ====LIBRARY SYSTEM====");
            System.out.println("1. Add book:");
            System.out.println("2. Search book by Title:");
            System.out.println("3. List of books:");
            System.out.println("4. Exit");
            System.out.println("Choose an option(1-4)");

            int choices = scanner.nextInt();
            switch (choices){
                case 1:

                    scanner.nextLine();
                    System.out.println("Enter book title: ");
                    String title = scanner.nextLine();

                    System.out.println("Enter author name: ");
                    String author = scanner.nextLine();

                    System.out.println("Enter book id: ");
                    int id = scanner.nextInt();

                    library.addBook(title,author,id);
                    break;

                case 2:
                    scanner.nextLine();
                    System.out.println("Enter title to search: ");
                    String searchTitle = scanner.nextLine();
                    Book search = library.searchBookByTitle(searchTitle);

                    if (search != null){
                        System.out.println("Search: " + search);
                    }else {
                        System.out.println("Book not found");
                    }
                    break;
                case 3:
                    library.listBook();
                    break;

                case 4:
                    System.out.println("Exiting system");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again");
            }
        }

    }









}
