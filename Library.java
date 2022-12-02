import java.util.Scanner;
 
// Class
public class Library {
    static String userName;
 
    // Main driver method
    public static void main(String[] args)
    {

        
        // Creating object of Scanner class
        // to take input from user
        Scanner input = new Scanner(System.in);



        System.out.println("---------------------------------");
        System.out.println("Please enter your name");
        //Set userName to userInput
        userName = input.next();
        System.out.println("---------------------------------");
        System.out.println("Hello " + userName + " ");
        System.out.println("How may I help you today...");
        System.out.println("---------------------------------");
        //User Startup End
 
        // Creating object of book class
        books ob = new books();
 
        int choice;
        int searchChoice;
 
        // Creating menu
        // using do-while loop
        do {
 
            ob.dispMenu();
            choice = input.nextInt();
 
            // Switch case
            switch (choice) {
 
                // Case
            case 1:
                book b = new book();
                ob.addBook(b);
                break;
 
                // Case
            case 2:
                ob.upgradeBookRating();
                break;
 
            // Case
            case 3:
 
                System.out.println(
                    " press 1 to Search with Book Serial No.");
                System.out.println(
                    " Press 2 to Search with Book's Author Name.");
                searchChoice = input.nextInt();
 
                // Nested switch
                switch (searchChoice) {
 
                    // Case
                case 1:
                    ob.searchBySno();
                    break;
 
                    // Case
                case 2:
                    ob.searchByAuthorName();
                }
                break;
 
                // Case
            case 4:
                ob.showAllBooks();
                break;
 
                // Default case that will execute for sure
                // if above cases does not match
            default:
 
                // Print statement
                System.out.println("ENTER BETWEEN 0 TO 4.");
            }
 
        }
 
        // Checking condition at last where we are
        // checking case entered value is not zero
        while (choice != 0);
    }
}
