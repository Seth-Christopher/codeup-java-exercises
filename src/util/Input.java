package util;

import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public String getString(){
        System.out.println("Enter your text:");
        return scanner.nextLine();


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

    public int getInt(){
        System.out.println("Enter a number: ");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double userNumber;
        do {
            System.out.printf("Enter a number between %f and %f:%n", min, max);
            userNumber = scanner.nextDouble();
        } while (userNumber < min || userNumber > max);
        return userNumber;
    }

    public double getDouble(){
        System.out.println("Enter a number: ");
        return scanner.nextDouble();
    }

    public Input(){
        this.scanner = new Scanner(System.in);
    }


}
