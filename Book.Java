import java.util.Scanner;

public class Book {

    //Create our general characteristics that each book will have
    public String bookName;
    public String bookAuthor;
    public int bookPageCount;
    public String bookGenre;
    public int bookProgress;
    public double bookRating;
    Scanner input;

    //Method to add a book
    public void addBook() {

        //Get user input and set each characteristic to that input.
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
        System.out.println("---------------------------------");
    }
    //End addBook method

    //Method to view a book
    //Call this with the prefix book after searching to display the searched books characteristics in a formatted view.
    public void viewBook(){
        System.out.println(this.bookName + " By: "+ this.bookAuthor);
        System.out.println(this.bookGenre);
        System.out.println("Your Progress is: " + this.bookProgress + " out of " + this.bookPageCount);
        System.out.println("You rated this book: " + this.bookRating);
        System.out.println("---------------------------------");
        System.out.println("       Type 1 to continue");
        if(input.nextInt() == 1){

        }

    }


}
