import java.util.*;
public class Main {

    private static int choice;
    static Scanner keyboard = new Scanner(System.in);
    static String userName;
    static List<Book> books;

    public static void main(String[] args) {
        books = new ArrayList<>();
        //User Startup
        System.out.println("---------------------------------");
        System.out.println("Please enter your name");
        //Set userName to userInput
        userName = keyboard.next();
        System.out.println("---------------------------------");
        System.out.println("Hello " + userName + "");
        System.out.println("How may I help you today...");
        System.out.println("---------------------------------");
        //User Startup End

        //Initialize menu method
        menu();
    }

    private static void menu() {
        Book book;

        //Give choice
        System.out.println("\t1. Add a book ");
        System.out.println(" ");

        System.out.println("\t2. Remove a book ");
        System.out.println(" ");

        System.out.println("\t3. Update a book ");
        System.out.println(" ");

        System.out.println(" \t4. View a book ");
        System.out.println(" ");

        System.out.println(" \t5. Search library ");
        System.out.println(" ");

        System.out.println(" \t6. Close program ");
        System.out.println(" ");

        //take user input
        System.out.print("Enter the number that applies: ");
        System.out.println(" ");

        System.out.println("---------------------------------");

        //Store the users choice in an int
        int choice = keyboard.nextInt();
        keyboard.nextLine();

        //Use the users choice to initialize that section of our system using switch(choice)
        switch (choice) {
            case 1:
                System.out.println("You have selected 'Add a book'");
                System.out.println("         Loading now...");
                System.out.println("---------------------------------");
                book = new Book();
                book.addBook();
                books.add(book);
                menu();
                break;
            case 2:
                System.out.println("You have selected 'Remove a book'");
                System.out.println("         Loading now...");
                System.out.println("---------------------------------");
                break;
            case 3:
                System.out.println("You have selected 'Update a book'");
                System.out.println("         Loading now...");
                System.out.println("---------------------------------");
                break;
            case 4:
                System.out.println("You have selected 'View a book'");
                System.out.println("         Loading now...");
                System.out.println("---------------------------------");
                //loop through array of books assigning them to a number you can type and view

                menu();
                break;
            case 5:
                System.out.println("You have selected 'Search Library'");
                System.out.println("         Loading now...");
                System.out.println("---------------------------------");
                System.out.println("Please enter the Book Name:");
                String term = keyboard.nextLine();
                book = searchBook(term);
                book.viewBook();
                menu();
                break;
            case 6:
                System.out.println("You have selected 'Close Program'");
                System.out.println("Have a wonderful day "+ userName + "!");
                System.out.println("---------------------------------");
                break;
            default:
                System.out.println("That is not a valid command...");
                System.out.println("Please try again...");

        } //End of switch system

    }//End of menu Method
        public static Book searchBook(String term) {
            for(Book book: books) {
                if(book.bookName.toLowerCase().equals(term.toLowerCase())) {
                    return book;
                }
            }
            return null;
        }
}
