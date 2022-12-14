import java.util.*;
public class Main {

    private static int choice;
    static Scanner keyboard = new Scanner(System.in);
    static String userName;
    //Create our list variable 'books'
    static List<Book> books;

    static String term;

    public static void main(String[] args) {
        //initialize our arraylist, so we are able to populate it with our book objects.
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


    //Menu method
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
                //Set book = a new book
                book = new Book();
                //Call the addBook method which fills our book object with its characteristics.
                book.addBook();
                //Add our book object with the characteristics to our arraylist.
                books.add(book);
                //After its purpose is fulfilled recall the menu method.
                menu();
                break;
            case 2:
                System.out.println("You have selected 'Remove a book'");
                System.out.println("         Loading now...");
                System.out.println("---------------------------------");

                //Make this into a remove method
                System.out.println("Please Enter the title of the Book you wish to Delete.");
                term = keyboard.nextLine();
                book = searchBook(term);
                System.out.println("Are you sure you want to remove : " + book.bookName + " from your virtual Bookcase?");
                System.out.println("\t1 : yes");
                System.out.println("\t2 : no");
                int input = keyboard.nextInt();

                if(input == 1) {
                    books.remove(book);
                    System.out.println("Successfully Removed");
                    System.out.println("---------------------------------");
            }
                menu();
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
                //loop through array of books assigning them to a number you can type and view.
                System.out.println("Please Enter the title of the Book you wish to view.");
                term = keyboard.nextLine();
                book = searchBook(term);
                book.viewBook();
                //After its purpose is fulfilled recall the menu method.
                menu();
                break;
            case 5:
                System.out.println("You have selected 'Search Library'");
                System.out.println("         Loading now...");
                System.out.println("---------------------------------");


                //After its purpose is fulfilled recall the menu method.
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

    //Search Book Method
    public static Book searchBook(String term) {
            //For each book in our books array
            for(Book book: books) {
                //Search if the input term matches a book we have stored in our array and then return that book;
                if(book.bookName.toLowerCase().equals(term.toLowerCase())) {
                    return book;
                }
            }
            //if it doesn't match return null and reinitialize menu method
            System.out.println("The book you've entered does not match a book in your Bookcase");
            System.out.println("        Please try again");
            System.out.println("---------------------------------");
            menu();

            //If the input does not match return null (change, so it displays an error message and retakes input)
            return null;
        }
    //End of Search Book Method
}

