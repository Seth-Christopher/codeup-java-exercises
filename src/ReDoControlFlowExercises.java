public class ReDoControlFlowExercises {
    public static void main(String[] args) {
        // 1. Loop Basics

        // A.
        int firstProblem = 5;
        while (firstProblem <= 15) {
            System.out.println(firstProblem);
            firstProblem++;
        }
        // B.
        int secondProblem = 0;
        do {
            System.out.println(secondProblem);
            secondProblem += 2;
        } while (secondProblem <= 100);

        int secondProblemBack = 100;
        do {
            System.out.println(secondProblemBack);
            secondProblemBack -= 5;
        } while (secondProblemBack >= -10);

        long squared = 2;
        do {
            System.out.println(squared);
            squared *= squared;
        } while (squared < 1000000);


        // C.
        for (firstProblem = 5; firstProblem <= 15; firstProblem++) {
            System.out.println(firstProblem);
        }

        for (secondProblem = 0; secondProblem <= 100; secondProblem++) {
            System.out.println(secondProblem);
            secondProblem++;
        }

        for (secondProblemBack = 100; secondProblemBack >= -10; secondProblemBack -= 5) {
            System.out.println(secondProblemBack);
        }

        for (squared = 2; squared < 1000000; squared *= squared) {
            System.out.println(squared);
        }


        // FIZZBUZZ \\

        for (int i = 0; i <= 100; i ++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
        }





    }
}
