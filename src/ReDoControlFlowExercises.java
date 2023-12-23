import java.util.Scanner;

public class ReDoControlFlowExercises {
    public static void main(String[] args) {
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

        System.out.println("Please enter a numerical grade from 0 to 100: ");
        int grade = scanner.nextInt();

        if (grade >= 99 && grade <= 100) {
        System.out.println("A++ ! Great Job!");
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



    }
}
