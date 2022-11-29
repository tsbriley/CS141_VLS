package College;
// Java Program to Illustrate students Class

// To Do all the Operations related to students:
// add Students,check-in books,check out books,ValidStudent

// Importing required classes
import java.util.Scanner;

// Class
public class friends {

    // Creating objects of Scanner and students class
    Scanner input = new Scanner(System.in);
    friend thefriends[] = new friend[50];

    public static int count = 0;

    // Method 1
    // To add books
    public void addfriend(friend s) {
        for (int i = 0; i < count; i++) {

            if (s.friends_password.equalsIgnoreCase(
                    thefriends[i].friends_password)) {

                // Print statement
                System.out.println(
                        "Freind " + s.friends_password
                                + " is Already Registered.");

                return;
            }
        }

        if (count <= 50) {
            thefriends[count] = s;
            count++;
        }
    }

    // Method 2
    // Displaying all students
    public void showAllfriends() {
        // Printing student name and
        // corresponding registered number
        System.out.println("Friends Name\t\tPassword number");
        for (int i = 0; i < count; i++) {

            System.out.println(thefriends[i].friendsName
                    + "\t\t"
                    + thefriends[i].friends_password);
        }
    }

    // Method 3
    // To check the Student
    public int isfriend() {
        // Display message only
        System.out.println("Enter password Number:");

        String passNum = input.nextLine();

        for (int i = 0; i < count; i++) {

            if (thefriends[i].friends_password.equalsIgnoreCase(
                    passNum)) {
                return i;
            }
        }

        // Print statements
        System.out.println("Cannot find friend in the system.");
        System.out.println("Get Registered First.");

        return -1;
    }

    // Method 4
    // To remove the book
    public void checkOutBook(books book) {
        int friendIndex = this.isfriend();

        if (friendIndex != -1) {
            System.out.println("checking out");

            book.showAllBooks();
            book b = book.checkOutBook();

            System.out.println("checking out");
            if (b != null) {

                if (thefriends[friendIndex].booksCount <= 3) {

                    System.out.println("adding book");
                    thefriends[friendIndex].borrowedBooks[thefriends[friendIndex].booksCount] = b;
                    thefriends[friendIndex].booksCount++;

                    return;
                } else {

                    System.out.println(
                            "Friends Can not Borrow more than 3 Books.");
                    return;
                }
            }
            System.out.println("Book is not Available.");
        }
    }

    // Method 5
    // To add the book
    public void checkInBook(books book) {
        int friendIndex = this.isfriend();
        if (friendIndex != -1) {

            // Printing credentials corresponding to student
            System.out.println(
                    "S.No\t\t\tBook Name\t\t\tAuthor Name");

            friend s = thefriends[friendIndex];

            for (int i = 0; i < s.booksCount; i++) {

                System.out.println(
                        s.borrowedBooks[i].sNo + "\t\t\t"
                                + s.borrowedBooks[i].bookName + "\t\t\t"
                                + s.borrowedBooks[i].authorName);
            }

            // Display message only
            System.out.println(
                    "Enter Serial Number of Book to be Checked In:");

            int sNo = input.nextInt();

            for (int i = 0; i < s.booksCount; i++) {
                if (sNo == s.borrowedBooks[i].sNo) {
                    book.checkInBook(s.borrowedBooks[i]);
                    s.borrowedBooks[i] = null;

                    return;
                }
            }

            System.out.println("Book of Serial No " + sNo
                    + "not Found");
        }
    }
}