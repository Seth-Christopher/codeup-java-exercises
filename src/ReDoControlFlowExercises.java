import java.util.InputMismatchException;
import java.util.Scanner;

public class ReDoControlFlowExercises {
    public static void main(String[] args) {

        int myFavNum = 2;
        String myString = "This is my favorite number " + myFavNum;
        System.out.println(myString);



        // 1. Loop Basics

        // A.
//        int firstProblem = 5;
//        while (firstProblem <= 15) {
//            System.out.println(firstProblem);
//            firstProblem++;
//        }
//        // B.
//        int secondProblem = 0;
//        do {
//            System.out.println(secondProblem);
//            secondProblem += 2;
//        } while (secondProblem <= 100);
//
//        int secondProblemBack = 100;
//        do {
//            System.out.println(secondProblemBack);
//            secondProblemBack -= 5;
//        } while (secondProblemBack >= -10);
//
//        long squared = 2;
//        do {
//            System.out.println(squared);
//            squared *= squared;
//        } while (squared < 1000000);
//
//
//        // C.
//        for (firstProblem = 5; firstProblem <= 15; firstProblem++) {
//            System.out.println(firstProblem);
//        }
//
//        for (secondProblem = 0; secondProblem <= 100; secondProblem++) {
//            System.out.println(secondProblem);
//            secondProblem++;
//        }
//
//        for (secondProblemBack = 100; secondProblemBack >= -10; secondProblemBack -= 5) {
//            System.out.println(secondProblemBack);
//        }
//
//        for (squared = 2; squared < 1000000; squared *= squared) {
//            System.out.println(squared);
//        }
//
//
//        // FIZZBUZZ \\
//
//        for (int i = 0; i <= 100; i ++) {
//            if (i % 3 == 0 & i % 5 == 0) {
//                System.out.println("Fizz Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }


        // TABLE OF POWERS \\

        Scanner scanner = new Scanner(System.in);

        long userNum;

        System.out.printf("What number would you like to go up to on a given table that displays the number squared, and cubed? %n");


        userNum = scanner.nextInt();

        System.out.printf("Here is your table! %n");

        System.out.println();
        System.out.printf("""
                number | squared | cubed
                ------ | ------- | ------
                """);

        for ( long i = 1; i <= userNum; i ++) {
            System.out.printf("%-6d | %-7d | %-7d %n", i, i * i, i * i * i);
        }


        // GRADES \\

        // Two different ways we can run this code and ensure the user isn't allowed to enter anything other than an Integer
        // We will use a try a catch to handle the InputMismatchException
        // We will also use the .hasNextInt(); method


        System.out.println("Please enter a numerical grade from 0 to 100: ");

        // want to set the initial value of grade to 0
        int grade = 0;
        // creating a boolean that will be set to false
        boolean validInput = false;

        // --------- TRY CATCH -------- \\

        // while not false
//        while (!validInput) {
//
//            try {
//                // this is to get users input
//                grade = scanner.nextInt();
//                // setting the users input to true
//                validInput = true;
//            } catch (InputMismatchException e) { // catching the exception
//                System.out.println("Invalid input. Please enter an integer.");
//                scanner.next(); // this will consume the invalid token (I guess cancel it out)
//            }
//        }

        // ---------- .hasNextInt() METHOD ------------- \\

        // while not false
        while (!validInput) {

            // hasNexInt method is checking to see if next input token can be
            // interpreted as an integer before attempting to read it.
            if (scanner.hasNextInt()) {
                // grabbing the users input
                grade = scanner.nextInt();
                // setting the input to true
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }

        if (grade >= 99 && grade <= 100) {
        System.out.println("A++ Great Job!");
        } else if (grade >= 88) {
            System.out.println("Your grade is an A");
        } else if (grade >= 80 && grade <= 87) {
            System.out.println("Your grade is a B");
        } else if (grade >= 67 && grade <= 79) {
        System.out.println("Your grade is a C");
        } else if (grade >= 60 && grade <= 66) {
            System.out.println("Your grade is a D");
        } else {
            System.out.println("F, you need help");
        }



    // ---------- AVERAGE TIP CALCULATOR ---------- \\

        double bill = 0;

        System.out.println("What was the total for your bill? ");
        bill = scanner.nextDouble();

        System.out.println("Below will be a chart with the different percentages based off your bill total. ");

        System.out.println("""
                  TIP PERCENTAGES
               ---------------------
               ---------|-------|-----
                10%     |  15%  |  20%
               ---------|-------|-----
                """);

//        for (double i = 2; i <= 3 ; i++) {
            System.out.printf(" $%.2f   | $%.2f | $%.2f", bill * .10, bill * .15, bill * .20);


//        }

        System.out.println("Happy New Year! Lets see what 24 brings.");


    }
}
