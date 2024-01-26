import java.util.Scanner;
public class StringExercise {

            // HOW TO FIND LENGTH OF INTEGER IN JAVA \\

    //  INTEGER LENGTH EXAMPLE USING WHILE LOOP
        // The countDig method calculates the number of digits in an integer.
        public int countDig(int n) {    // the method takes an integer n as input
            int count = 0;              // initializes a counter variable count to 0. The counter will keep track of the number of digits in n
            while(n != 0) {             // method enters a while loop that continues as long as n is not equal to 0.
                n = n/10;       // n is divided by 10, effectively removing the last digit. For instance, if n was 1234, after this operation, n would become 123
            // increasing count by 1
                count = count +1;
            }

            return count;       // once n reaches 0 (meaning there are no more digits left), the loop ends.
                                // the method then returns the counter count which represents the number of digits in the original input integer
        }

    // USING STRING
        // Another idea can be to convert the number into a string and then compute its size.
        // Size of the string gives the length of the string.


    public static void main(String[] args) {

        // input array
            int[] arr = {78, 9, 2345, 899009, 1, 414, 34, 1000, 2749};
        // size of the input array
            int size = arr.length;
        // creating an object of the class StringExercise
            StringExercise obj = new StringExercise();
                for (int i = 0; i < size; i++) {
            int count = obj.countDig(arr[i]);
                    System.out.println("The length of the number " + arr[i] + " is " + count);
        }





        String s1 = "We don't need no education";
        String s2 = "We don't need no thought control";
        System.out.println(s1 + ", and " + s2);

        String s3 = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(s3);

        String s4 = "In window, the main drive is usually C:\\";
        System.out.println(s4);

        String s5 = "I can do backslashes \\, double backslashes \\\\ , and the amazing triple backslash \\\\\\! ";
        System.out.println(s5);


        //-- STRING LITERAL COMPARISON -- \\
        // the following example will print "Strings are equal"


        /* DON'T DO THIS

            if ("I am a string" == "I am a string") {
                System.out.println("Strings are equal");
            }
        */

        // But in general we cannot rely on that behavior, and should use either the
        // `equals` or `equalsIgnoreCase` method on a string object to compare string
        // values.


        // Do this instead!

//            if ("I am a string".equals("I am a string")) {
//                System.out.println("Strings are equal");
//            }

        // MORE EXAMPLES

        String input = "Codeup is no more..";

        if (input.equals("codeup rocks!")) {                 // always false
            System.out.println("Cool");
        }

        if (input.equals("Codeup is no more..")) {          // always true
            System.out.println("nice");
        }

        input.equalsIgnoreCase("codeup is no more..");      // always true

        input.equalsIgnoreCase("Codeup is no more..");      // always true

        input.startsWith("codeupt");        // false
        input.startsWith("Codeup");         // true

        input.endsWith("More..");
        input.endsWith("more");            // false
        input.endsWith("more..");          // true


//--------------------------- STRING MANIPULATION METHODS ------------------------- \\

        // the following methods can be used to manipulate strings \\


//   --------       SYNTAX:  char charAt (int index);
        // returns the character at the specified index of the string.
        // throws StringIndexOutOfBoundsException if the index is a negative value
        // or greater than or equal to the string length.

        String name = "example";
        char ch = name.charAt(4);
        System.out.println(ch);     // returns the char value at the 4th index


//   ---     Accessing First and Last Character by Using the charAt() Method
        String str = "Examples of charAt method";
        int strLength = str.length();
        System.out.println("Character at 0 index is: " + str.charAt(0));    // fetching first character

        System.out.println("Character at last index is: " + str.charAt(strLength - 1)); // the last character is present at the string length-1 index


//   ---     Print Characters Presented at Odd Positions by Using the charAt() Method

        String strTwo = "We are accessing all elements at odd index";
        for (int i = 0; i <= strTwo.length() - 1; i++) { // the -1 is necessary because array & string indices in Java start at 0, so last index of a string is always one less than its length.
            // -1 adjusts the loop to loop over the elements of the string from the first index(0) to the last index (one less than the length of the string), avoiding an IndexOutOfBoundsException
            if (i % 2 != 0) {
                System.out.println("Char at index " + i + " is " + strTwo.charAt(i));
            }
        }


//  ---      Counting Frequency of a character in a String by Using the charAt() Method

        String strThree = "Counting frequency of a character in a string";
        int count = 0;
        for (int i = 0; i < strThree.length() - 1; i++) {
            if (strThree.charAt(i) == 'a') {    // if statement checks if the current character is equal to 'a'. If it is,
                count++;    // count++ increments the value of count by 1
            }
        }
        System.out.println("Frequency of a is: " + count);


// ---------       int indexOf(String subString);
// returns the index of the first occurrence of a certain substring
// returns -1 if the substring is not found
// this method takes substring as an argument and returns the index of the first character of the substring

        String strFour = "This is indexOf method";
        // passing Substring
        int index = strFour.indexOf("method");  // returns the index
        System.out.println("index of substring " + index);


//   --------      int lastIndexOf(String subString);
        // like indexOf, but starts the search from the end of the string.
        // returns the last index of the given character value or substring.
        // if not found, returns -1.
        // index counter starts at 0

// ----- There are 4 types of lastIndexOf() method in Java. ------- \\

        // --  int lastIndexOf(int ch); -- \\
        // returns last index position for the given char value
        String exampleOne = "This is index of example"; // there are 2 's' characters in this sentence
        int index1 = exampleOne.lastIndexOf('s');  // returns the last index of 's' char value
        System.out.println(index1);                   // 6


        // -- int lastIndexOf(int ch, int fromIndex); -- \\
        // returns the last index position for the given substring
        String exampleTwo = "This is index of example";
        int index2 = exampleTwo.lastIndexOf('s', 5);
        System.out.println(index2);


        // -- int lastIndexOf(String substring); --\\
        // returns the last index position for the given substring
        String exampleThree = "This is last index of example.";
        int index3 = exampleThree.lastIndexOf("of");
        System.out.println(index3);

        // -- int lastIndexOf(String substring, fromIndex); --\\
        // returns last index of given position for the given substring and from index
        String exampleFour = "This is of course the last index of example.";
        int index4 = exampleFour.lastIndexOf("of", 2);  // tries to grab the index of                                                               "of"  within the first 2 indexes.
        System.out.println(index4);         // -1 if not found

        index4 = exampleFour.lastIndexOf("of", 10);
        System.out.println(index4);     // the index of "of" within the first 10 indexes is at index 8.




// --------       int length();
// returns the length of a string
// there are different approaches to find the length of an integer in Java
// --- we could use the following approaches to find the length of an integer ---- \\
        // Using while loop
        // Using String
        // Using Continuous Multiplication
        // Using Logarithm
        // Using Recursion
// Using while loop






        // returns a copy of the string that has pattern replaced with replacement
//        String replace(String pattern, String replacement);


        // returns a new substring that starts at a specified index and (optionally) ends at the specified index
//        String substring(int beginIndex[, int endIndex]);


        // returns a string that has all lowerCase letters
//        String toLowerCase();

        // returns a string that has all upperCase letters
//        String toUpperCase();


        // returns a copy of the string without leading and trailing whitespaces
//        String trim();


        // exercise String Basics
        String one = "We don't need no education.";
        String two = "We don't need no thought control.";
        System.out.printf("%s,%n%s%n", one, two);

        System.out.println("""
                Check "this" out!, "s inside of "s!
                """);

        System.out.println("""
                I can do backslashes \\, double backslashes \\\\, 
                and the amazing triple backslash \\\\\\!
                """);

        Scanner scanner = new Scanner(System.in);



    }
}
