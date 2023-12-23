import java.util.Scanner;

public class ControlFlowLectureandExercise {
    public static void main(String[] args) {
        // below we are using simple if else statements
//        int number1 = 3;
//        int number2 = 2;
//
//        if (number1 == 3) {
//            System.out.println("That is true.");
//        } else if (number1 == 4) {
//            System.out.println("That is false.");
//        } else {
//            System.out.println("What are you even talking about ?");
//        }
//
//        // switch statements
//        String customerChoice;
//
//        Scanner lectureScanner = new Scanner(System.in);
//        System.out.println("What flavor ice cream?");
//        customerChoice = lectureScanner.nextLine();
//
//
//        switch (customerChoice) {
//            case "vanilla":
//                System.out.println("One vanilla right up");
//                break;
//            case "chocolate":
//                System.out.println("One chocolate.");
//                break;
//            default:
//                System.out.println("We dont have that.");
//        }

        // below we used a loop to decrement, in order to perform 99 bottles of beer

//        boolean myBool = true;
//        if (myBool){
//            System.out.println("true!!!");
//        }
//        for (int i = 99; i > 0; i--){
//            switch (i) {
//                case 1:
//                    System.out.println(i + " bottles of beer on the                       wall,");
//                    System.out.println(i + " bottles of beer,");
//                    System.out.println("Take one down pass it                             around, ");
//                    System.out.println("No more bottles of beer on                        the wall.");
//                    break;
//                default:
//            System.out.println(i + " bottles of beer on the wall,");
//            System.out.println(i + " bottles of beer,");
//            System.out.println("Take one down pass it around, ");
//            System.out.println(i -1 + " bottles of beer on the                            wall.");
//        }
        // }



//  ----------EXERCISES----------------- \\

//---> Create an integer variable i with a value of 5.
//---> Create a while loop that runs so long as i is less than or equal to 15
//---> Each loop iteration, output the current value of i, then increment i by one.

//        int every5 = 5;
//        while (every5 <= 15) {
//            System.out.println(every5);
//            every5++;
//        }

        // REDOING THE JAVA LESSONS \\

        int countdown = 25;
        while(countdown >= 0) {
            System.out.println("Countdown " + countdown);
            countdown--;
        }

        int i = 0;
        while (i <= 10) {
            System.out.println("i is " + i);
            i++;
        }






//-------> Do While <------\\
// --->Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int count = 0;
//        do {
//            System.out.println(count);
//            count += 2;
//        } while (count < 100);
//---> Alter your loop to count backwards by 5's from 100 to -10.
//      int count = 100;
//        do {
//            System.out.println(count);
//            count -= 5;
//            } while (count > -15);
//        }}

        int countUp = 0;
        do {
            System.out.println(countUp);
            countUp += 2;
        } while (countUp <= 100);


        int countDown = 100;
        do {
            System.out.println(countDown);
            countDown -= 5;
        } while (countDown >= -10);




//---> Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
//      long count = 2;
//        do {
//            System.out.println(count);
//            count*= count;
//            } while (count <= 1000000);
////        }
//      }
        long squared = 2;
        do {
            System.out.println(squared);
            squared *= squared;
        } while (squared < 1000000);


//---> Refactor the previous two exercises to use a for loop instead.
        for(int sub = 100; sub > 0; sub -= 5 ) {
            System.out.println(sub);
        }

        for (int first = 5; first <= 15; first++) {
            System.out.println(first);
        }

        for (int second = 0; second <= 100; second++) {
            System.out.println(second);
            second ++;
        }

        for (int third = 100; third > -10;) {
            System.out.println(third);
            third -= 5;
        }

        for (long fourth = 2; fourth <= 1000000;) {
            System.out.println(fourth);
            fourth *= fourth;
        }
        
        for ( long fifth = 2; fifth < 1000; fifth *= fifth) {
            System.out.println(fifth);
            }


        for (int six = 0; six < 20; six++) {
            System.out.println("This is the 6th for-loop we will break at 15: " + six);
            if (six == 15) {
                break;
            }
        }

        // below we will do our 7th for-loop, but use continue statement to skip all even numbers.
        for (int seven = 0; seven <= 50; seven++) {
            if (seven % 2 == 1) {
                continue;
            }
            System.out.println(seven);
        }

            //-------->Fizzbuzz:<--------\\
//--->       Write a program that prints the numbers from 1 to 100.
//--->        For multiples of three: print “Fizz” instead of the number.
//--->        For the multiples of five: print “Buzz”.
//--->        For numbers which are multiples of both three and five:               print “FizzBuzz”.
//        for (int i = 0; i <= 100; i++){
//            if (i % 3 == 0 & i % 5 == 0){
//                System.out.println("Fizz Buzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }


//-------> Display a table of powers.

//---> Prompt the user to enter an integer.
//---> Display a table of squares and cubes from 1 to the value             entered.
//---> Ask if the user wants to continue.
//---> Assume that the user will enter valid data.
//---> Only continue if the user agrees to.

        String userChoice;
        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.println("Enter an integer");
//            int userInteger = Integer.parseInt(scanner.nextLine());
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | ------");
//            for (int i = 1; i <= userInteger; i++){
//                System.out.printf("%-6d | %-7d | %-7d %n", i, i*i, i*i*i);
//            }
//            System.out.println("Do you want to continue?");
//            userChoice = scanner.nextLine().toLowerCase();
//        } while (userChoice.equals("y") || userChoice.equals("yes"));


//--->       Convert given number grades into letter grades.

//--->        Prompt the user for a numerical grade from 0 to 100.
//--->        Display the corresponding letter grade.
//--->        Prompt the user to continue.
//--->        Assume that the user will enter valid integers for the              grades.
//--->        The application should only continue if the user agrees             to.
//
//       System.out.println("Enter a numeric grade between 0 and 100");
//       int grade = Integer.parseInt(scanner.nextLine());
//       char letterGrade = 'F';
//       if (grade > 60 && grade < 70) {
//           letterGrade = 'D';
//       } else if (grade < 80) {
//           letterGrade = 'C';
//       } else if (grade < 90) {
//           letterGrade = 'B';
//       } else if (grade < 100) {
//           letterGrade = 'A';
//       }
//       System.out.printf("The letter grade is %c%n", letterGrade);


    }}
