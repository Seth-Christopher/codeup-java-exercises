import java.util.Scanner;

public class MethodsExercises {
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    // using a loop
    public static int loopMultiply(int a, int b){
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

    // using recursion
    public static int multiply(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b > 0) {
            return a + multiply(a, b - 1);
        } else {
            return -multiply(a, -b);
        }
    }
    public static double division(double a, double b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static int getInteger(int min, int max) {
        min = 1;
        max = 10;
        String prompt = "Enter a number between " + min + ", " + max + ":";
        int userInput;

        Scanner newScanner = new Scanner(System.in);
        System.out.println(prompt);
        userInput = newScanner.nextInt();
        if (userInput <= 10 && userInput >= 1) {
            return userInput;
        }
            return getInteger(min, max);
        }

        public static void main (String[]args){
            System.out.println(getInteger(1, 10));
        }

    }


