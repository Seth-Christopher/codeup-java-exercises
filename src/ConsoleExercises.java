import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        String cohort = "Hippogriff";
        byte week = 9;
        double completionPercentage = 38.7525;
        System.out.print("Hello ");
        System.out.printf("You %s's, welcome to week %d !!! %nYou are %.4f%% of the way through.", cohort, week, completionPercentage);
        System.out.printf("%nThis is a new line.%n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userInput = scanner.nextLine();
        System.out.printf("Well hello %s , you cheeky bastard ;)", userInput);


        System.out.printf("%n Now enter a number:");
        int userNumber = scanner.nextInt();
        System.out.printf("You entered %d%n", userNumber);
        System.out.printf("%n Are you sure?");


    }
}
