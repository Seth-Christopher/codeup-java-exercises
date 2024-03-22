import java.util.Scanner;

public class quickRefreshFeb24 {


// REFACTORED CODE FOR ASKING THE USER TO INPUT A SENTENCE EXERCISE
    // To refactor the provided Java code snippet for reading a sentence from use. You can follow several best practices and techniques to improve the code's readability, maintainability, and efficiency.

/* 1. Extract Validation Logic into Methods: Break down the validation logic into separate methods to improve         modularity and readability.
    This approach aligns with the principle of Single Responsibility Principle (SRP), making each method            responsible for a single piece of functionality.

    2. Use Descriptive Variable and Method Names to make their purpose clear.

    3. Remove Redundant Code: The sentence.next() inside the first inner while loop seems redundant since it's not used. Consider removing it to avoid confusion.

    4. Simplify Conditional Logic: Use the continue statement more effectively to reduce nesting and improve       readability.

    5. Leverage Regular Expressions for Validation: Use regular expressions for more complex validation checks, such as ensuring the input does not contain numbers.
 */
    private static final int MINIMUM_LENGTH = 10; // Declares a constant whose value cannot be changed. Used to define fixed values.

    private static String getRefactoredUserSentence(Scanner refactored) { // method takes a scanner object as a parameter and returns a String.
        System.out.println("Enter a full length sentence. Minimum 10 letters. No numbers.");
        while (true) { // start of infinite loop. Will continue until broken out of.
            String refactoredSentence = refactored.nextLine(); // reads a line of text from the user and stores it in the refactoredSentence variable.
            if (isValidSentence(refactoredSentence)) { // calls isValidSentence method. If returns true, then code inside if block is executed.
                return refactoredSentence; // if sentence is valid then returned from the getRefactoredUserSentence method.
            }
        }
    }

    private static boolean isValidSentence(String sentence) { // method takes a string as a parameter and returns a boolean
        if (sentence.trim().isEmpty()) { // this line checks if the sentence is empty after removing any leading and trailing whitespace.
            System.out.println("Please enter a sentence, input cannot be empty."); // if sentence is empty, this line runs
            return false; // method returns false indicating that the sentence is not valid.
        }
        if (sentence.matches("\\d+")) { // this line checks if the sentence contains only digits.
            System.out.println("Input cannot be a number! enter a sentence."); // if contains only digits, this line runs.
            return false;
        }
        if (sentence.trim().length() < MINIMUM_LENGTH) { // checks if sentence is shorter than the minimum length.
            System.out.println("Please try again, at least 10 letters."); // if sentence is too short this line runs.
            return false;
        }
        return true; // if none of the previous conditions are met, the method returns true. Indicating sentence is valid.
    }



    public static void main(String[] args) {    // This line defines the main method, which is the entry point of any Java application. The main method is where the program starts executing.

        Scanner refactored = new Scanner(System.in);
        String usersSentence = getRefactoredUserSentence(refactored); //method returns a string. Stores as usersSentence
        System.out.println("You entered: " + usersSentence);


// The refactored code introduces the following improvements:
    // Modularity: The validation logic is encapsulated in the isValidSentence method. Making code more         modular and easier to maintain.
    // Readability: By using descriptive method names and simplifying the conditional logic, the code becomes   more readable.
    // Efficiency: The removal of redundant code and the use of a constant for the MINIMUM_LENGTH improve the   efficiency of the code.

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

//        explore.close();    // Proper resource management: it's important to close the Scanner object after use to avoid resource leaks.

    // below is the exercise for asking the user to input a sentence.
        // we use a while loop with Scanner, and if else statements to ensure our desired request
        Scanner sentence = new Scanner (System.in);

        System.out.println("Enter a full length sentence. Minimum 10 letters. No numbers.");

        String userSentence;
        while (true) {
            while (!sentence.hasNextLine()) {
                System.out.println("Please enter a full length sentence, as directed before.");
                sentence.next();
            }
            userSentence = sentence.nextLine();

            if (userSentence.trim().isEmpty()) {
                System.out.println("Please enter a sentence, input cannot be empty.");
                continue;
            }

            if (userSentence.matches("\\d+")) {
                System.out.println("Input cannot be a number! Enter a sentence.");
                continue;
            }
            if (userSentence.trim().length() < 10) {
                System.out.println("Please try again, at least 10 letters.!");
            } else {
                break;
            }
        }
    //---------- WE WILL REFACTOR THE ABOVE CODE USING PHIND. THE REFACTORED CODE WILL BE ALL THE WAY AT THE TOP BECAUSE OF THE PRIVATE FINAL VARIABLES. --------------\\

// --------------------------------------------------------------------------------------------------------------
// calculate the perimeter and area of a room
        Scanner roomScanner = new Scanner(System.in);

        System.out.println("Please enter a length for the room?");
        double length = (roomScanner.nextDouble());

        System.out.println("What is the width?");
        double width = roomScanner.nextDouble();

        double area = length * width;
        double perimeter = (length * 2) + (width * 2);

        System.out.printf("""
                Area | Perimeter
                %.2f   | %.2f %n""", area, perimeter);

//---------------------------------------------------------------------------------------------------------------
// ---------------- Control Flow Exercises -------------------\\
    //  String Comparison
    /*  While we use == to compare primitive types. We need to handle strings a little differently.
        Each String is a different object.
    */
        Scanner sc = new Scanner (System.in);
        System.out.print("Continue? [y/N] ");
        String userInputs = sc.next();

    // DON'T DO THIS!!
        boolean confirmation = userInputs == "y";
// In the above example, confirmation will always be false, even if the user types "y".
// Instead, we should use either the .equals or .equalsIgnoreCase methods on the String we want to compare.
    // DO THIS INSTEAD
        boolean confirmations = userInputs.equals("y");










    }
}
