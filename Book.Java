import java.util.Scanner;

public class Book {

    public String bookName;
    public String bookAuthor;
    public int bookPageCount;
    public String bookGenre;
    public int bookProgress;
    public double bookRating;
    Scanner input;

    //Method to add a book
    public void addBook() {

        this.input = new Scanner(System.in);
        System.out.println("Please enter the Book Name:");
        this.bookName = input.nextLine();
        System.out.println("Now enter the Author Name:");
        this.bookAuthor = input.nextLine();
        System.out.println("Now the Page Count:");
        this.bookPageCount = input.nextInt();
        input.nextLine();
        System.out.println("Enter the Genre:");
        this.bookGenre = input.nextLine();
        System.out.println("Enter your Page Progress:");
        this.bookProgress = this.input.nextInt();
        input.nextLine();
        System.out.println("Enter your Rating Out of 10:");
        this.bookRating = this.input.nextDouble();

        System.out.println("Thank you, Successfully added your book.");
    }

    //Method to view a book
    public void viewBook(){
        System.out.println(this.bookName + " By: "+ this.bookAuthor);
        System.out.println(this.bookGenre);
        System.out.println("Your Progress is: " + this.bookProgress + " out of " + this.bookPageCount);
        System.out.println("You rated this book: " + this.bookRating);
    }
}
