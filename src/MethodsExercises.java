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

    // using a loop as to not use the * operator per exercise
    public static int loopMultiply(int a, int b){
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

    // using recursion, again as to not use the * operator per exercise
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
        Scanner newScanner = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d : ", min, max);
        int userInput = newScanner.nextInt();
        if (userInput <= 10 && userInput >= 1) {
            return userInput;
        }
            return getInteger(min, max);
        }

    public static int randomInt(int low, int high) {
        return (int) Math.floor(Math.random() * (high - low + 1) + low);
    }
        // DocRobs factorial function (method)
        public static long fact(long n) {
            if(n == 1 || n == 2) {
                return n;
            }
            return n * fact(n - 1);
        }



        public static void roll2Dice(int numSides) {
            int die1 = randomInt(1, numSides);
            System.out.println("Your roll a " + die1);

            int die2 = randomInt(1, numSides);
            System.out.println("You rolled a " + die2);
        }


        // below is where we call and use the above functions (methods)
        // we perform our tasks within the main

        public static void main (String[]args){
            Scanner mainScanner = new Scanner(System.in);
//            System.out.println(getInteger(1, 10));
            System.out.println("Enter the number of sides for a pair of dice: ");
            int sideNum = mainScanner.nextInt();
            mainScanner.nextLine();

            System.out.println("Press Enter to roll some dice!");
            mainScanner.nextLine();

            roll2Dice(sideNum);

            System.out.println("Roll the dice again (y/n)? ");
            String choice = mainScanner.nextLine().trim();
            if(choice.equalsIgnoreCase("Y")) {
                roll2Dice(sideNum);
            }
            mainScanner.close();


        }

    }


