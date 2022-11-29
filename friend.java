package College;
// Java Program to Illustrate Student Class

// to take Input from the student and related Information

// Importing required classes
import java.util.Scanner;

// Class
public class friend {

    // Class member variables
    String friendsName;
    String friends_password;

    book borrowedBooks[] = new book[3];
    public int booksCount = 0;

    // Creating object of Scanner class to
    // take input from user
    Scanner input = new Scanner(System.in);

    // Constructor
    public friend() {
        // Print statement
        System.out.println("Enter friend :");

        // This keywords refers to current instance
        this.friendsName = input.nextLine();

        // Print statement
        System.out.println("Enter password Number:");
        this.friends_password = input.nextLine();
    }
}