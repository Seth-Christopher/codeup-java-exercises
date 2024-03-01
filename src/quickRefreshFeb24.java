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

        System.out.printf("Enter something. %n");
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

// Explore the Scanner Class. (codeup curriculum)
        Scanner explore = new Scanner(System.in);

        String firstWord;
        String secondWord;
        String thirdWord;
    // using .split() method in order to grab 1 word from user input.
        System.out.println("Enter 3 words.");
        firstWord = explore.nextLine().split(" ") [0]; // using split to grab word at index 0
        secondWord = explore.nextLine().split(" ") [0];
        thirdWord = explore.nextLine().split(" ") [0];
        System.out.printf("You entered: %s, %s, %s. %n", firstWord, secondWord, thirdWord);

//--------------- using phind to clean up the above code ------------------ \\
    // using same scanner as above, as to not confuse
        // use a for loop for repetitive tasks, instead of repeating lines of code like above.
        System.out.println("Enter 3 colors.");
        String[] words = new String[3]; // Array for storing words, instead of individual variables. Makes code more flexible and easier to extend if the number of words to read changes.

        for (int i = 0; i < 3; i++) {
            words[i] = explore.nextLine().split(" ") [0];
        }

        System.out.printf("You entered these colors: %s, %s, %s.%n", words[0], words[1], words[2]);

//        explore.close();    // Proper resource management: it is important to close the Scanner object after use to avoid resource leaks.





// calculate the perimeter and area of a room
        Scanner roomScanner = new Scanner(System.in);
        int length;
        int width;
        int perimeter;
        int area;
        System.out.println("What is the length of the room?");
        length = roomScanner.nextInt();

        System.out.println("What is the width?");
        width = roomScanner.nextInt();

        area = length * width;
        perimeter = (length * 2) + (width * 2);

        System.out.printf("""
                Area | Perimeter
                %d   | %d %n""", area, perimeter);





    }
}
