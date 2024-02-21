import java.util.Scanner;

public class quickRefreshFeb24 {
    public static void main(String[] args) {
        // Variables in java must be declared before they are used.
        // includes a type for the variable, as well as a name (a valid identifier) for the variable.
        // examples of variable declaration \\
        int id = 123;
        boolean isLoggedIn = false;
        double bankAccountBalance = 1000.23;

//    Create an int variable named myFavoriteNumber and assign your favorite number to it.
        int myFavoriteNumber = 2;


//     Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Hello World.";
        System.out.println(myString);

//    Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        double myNumber = 23;
        System.out.println(myNumber);
//    Change your code to assign the value 3.14 to myNumber. What do you notice?

        myNumber = 3.14;
        System.out.println(myNumber);
//    Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        myNumber = 123L;
        System.out.println(myNumber);
//    Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        myNumber = (float) 3.14;
        System.out.println(myNumber);
        System.out.printf("%.2f %n", myNumber);    // using souf, and %.2 for how many decimal spaces

        int x = 4;
        x += 5;

        x = 10;
        int y = 4;
        y *= x;

        y = 2;
        x /= y;
        y -= x;
        System.out.println(x);

//  Scanner class allows us to get data input that the user enters into the console.
    // in order to first use the Scanner class, you'll need to import it.
        Scanner scannerExample = new Scanner(System.in);

        System.out.println("Enter something.");
        String userInput = scannerExample.nextLine();   // this variable will store the users input as String.

        System.out.printf("You entered --> %s . Right? %n", userInput);

        userInput = scannerExample.nextLine(); // reusing the variable, to ask follow on question
                                                // and get user feedback.

//  Below, creating a simple if else statement.
    // using equalsIgnoreCase() is a better approach, as the comparison is case-insensitive.
    // will make your program more user-friendly.
        if (userInput.equalsIgnoreCase("no")){
            System.out.println("what the hell!");
        } else {
            System.out.printf("I knew it! %n");
        }


    }
}
