package util;

import java.util.Scanner;


public class Input {

    private final Scanner scanner;

    public String getString() {
        return scanner.nextLine();
    }


    public String getString(String prompt) {
        System.out.print(prompt);
        return getString();
    }



    public boolean yesNo(){
        System.out.println("Yes or NO?");
        return scanner.next().equalsIgnoreCase("yes");
    }

    public int getInt (int min, int max){
        int userNumber;
        do {
            System.out.printf("Enter a number between %d and %d:%n", min, max);
            userNumber = scanner.nextInt();
        } while (userNumber < min || userNumber > max);
        return userNumber;
    }

// exceptions exercise:
    public int getInt() {
        String input = getString();
        try {
            return Integer.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer input, try again loser..");
            return getInt();
        }
    }
//        System.out.println("Enter a number: ");
//        return scanner.nextInt();

    public int getInt(int min, int max, String prompt) {
        System.out.print(prompt);
        int anInt = getInt();
        if(anInt < min || anInt > max) {
            System.out.printf("Hey! That was not between %d and %d!!%n", min, max);
            return getInt(min, max, prompt);
        }
        return anInt;
    }

    public double getDouble(double min, double max) {
        double userNumber;
        do {
            System.out.printf("Enter a number between %f and %f:%n", min, max);
            userNumber = scanner.nextDouble();
        } while (userNumber < min || userNumber > max);
        return userNumber;
    }
// exceptions exercise:
    public double getDouble() {
        String input = getString();
        try {
            return Double.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid double input, try again loser..");
            return getDouble();
        }
    }
//        System.out.println("Enter a number: ");
//        return scanner.nextDouble();


    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Input input = new Input();

        input.getDouble();
    }

}

