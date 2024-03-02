import java.util.Scanner;


public class ConsoleIOExercise {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f.%n", pi);
//
        Scanner userPrompt = new Scanner(System.in);
////        System.out.println("Enter a number");
////        String userInput = userPrompt.nextLine();
//
//        Scanner userPrompt2 = new Scanner(System.in);
//        String string1;
//        String string2;
//        String string3;
//        System.out.println("Enter three words:");
////
//        string1 = userPrompt2.nextLine();
//        string2 = userPrompt2.nextLine();
//        string3 = userPrompt2.nextLine();
//
//        System.out.printf("You entered %s, %s, %s %n" , string1,string2,string3 );
//
//        String fullSentence;
//        System.out.println("Write me a sentence:");
//
//        fullSentence = userPrompt2.nextLine();
//        System.out.println("Your Sentence: " + fullSentence);
//
//        int length;
//        int width;
//        int perimeter;
//        int area;
//        System.out.println("What is the length of your living room?");
//        length = Integer.parseInt(userPrompt2.nextLine());
//        System.out.println("What is the width in feet of your living room?");
//        width = Integer.parseInt(userPrompt2.nextLine());
//        area = length * width;
//        perimeter = 2*length + 2*width;
//
//        System.out.printf("The area of your living room is %dft , and the perimeter of your living room is %dft.", area, perimeter);


//-------------------- THE ABOVE CODE IS MY INITIAL WORK. BELOW, IS JUST MY REFRESHER-----------

//        double pi = 3.14159;
//
//            System.out.printf("The value of pi is approximately %.2f. %n", pi);
//


        // The below code starts by printing a message asking the user to input a number
        // Declares an integer variable anuNumber without initializing it
        // Enters an infinite loop (while (true)) which will continue until a valid number
        // Is greater than 5.
            System.out.println("Quick, give me a number, any number.");
            int anyNumber;  // declaring our any number variable
        // using the Scanner from way above. userPrompt
            while (true) {  // whole code is wrapped in a while loop.
                while (!userPrompt.hasNextInt()) {  // this while loop within the outer while loop, will run while userPrompt does NOT have an integer
                    System.out.println("That is not a number! Please enter an an integer"); // prints error message.
                    userPrompt.next();  // advances scanner to the next token, discarding the invalid input
                }
                anyNumber = userPrompt.nextInt();   // if the next token is an integer, it assigns to this variable.
                if (anyNumber < 5) {    // if less than 5, repeat loop.
                    System.out.println("Please make it an integer larger than 5:");
                } else {
                    break;
                }
            }


        Scanner confirmation = new Scanner(System.in);

            System.out.printf("So the number you choose is %s ? %n", anyNumber);
            String userReply = confirmation.nextLine();


        int userReplyTwo;
        if (userReply.equalsIgnoreCase("Y") || userReply.equalsIgnoreCase("Yes")) {
                System.out.println("You win!");
            } else {
            System.out.println("Well that's not cool, pick again: ");
            while (true) {
                while (!confirmation.hasNextInt()) {
                    System.out.println("Try again, that's not a number:");
                    confirmation.next();
                }
                userReplyTwo = confirmation.nextInt();
                if (userReplyTwo < 5) {
                    System.out.println("Please make it an integer larger than 5:");
                } else {
                    System.out.println("thanks dude");
                    break;
                }
            }
        }



// Prompt a user to enter 3 words, each stored in a variable.
// Using .split() method in order to grab 1 word, if the user were to input
// multiple words on one line.

        Scanner threeWords = new Scanner(System.in);

        String firstWord;
        String secondWord;
        String thirdWord;
        System.out.println("Enter three words: ");

        firstWord = threeWords.nextLine().split(" ") [0]; // Here I use the split() method to grab ONLY the first word if the user inputs multiple words on one line.

        secondWord = threeWords.nextLine().split(" ") [0]; // you can change the index depending on which word in the users given string you want to grab.
        thirdWord = threeWords.nextLine().split(" ") [0];

        System.out.printf("So %s, %s, and %s are your three words. %n", firstWord,secondWord,thirdWord);


// --------------prompt the user to input a sentence

        String userSentence;
        System.out.println("Now enter a sentence");

        userSentence = threeWords.nextLine();
        System.out.printf("A COPY OF WHAT YOU SAID: '%s'%n", userSentence);

//----------------------------- calculate and bonus

        Scanner calculate = new Scanner(System.in);

        calculate.useDelimiter("\n");
        double length;
        double width;

        System.out.printf("To calculate the area and perimeter of a given area, please input a valid Length: %n");
        length = calculate.nextDouble();

        System.out.printf("Now enter a valid Width: %n");
        width = calculate.nextDouble();

        System.out.printf("Based on the Length and Width you have given me, the Area would calculate to %.3f sq.ft. %n", length * width);

        System.out.printf("The Perimeter would calculate to %.3f sq.ft. %n", 2 * (length + width));
    }
}