public class StringExercise {
    public static void main(String[] args){




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



//          SYNTAX:  char charAt (int index);
        // returns the character at the specified index of the string.
        // throws StringIndexOutOfBoundsException if the index is a negative value
        // or greater than or equal to the string length.

        String name = "example";
        char ch = name.charAt(4);
        System.out.println(ch);     // returns the char value at the 4th index


//        Accessing First and Last Character by Using the charAt() Method
        String str = "Examples of charAt method";
        int strLength = str.length();
        System.out.println("Character at 0 index is: " + str.charAt(0));    // fetching first character

        System.out.println("Character at last index is: " + str.charAt(strLength-1)); // the last character is present at the string length-1 index



//        Print Characters Presented at Odd Positions by Using the charAt() Method

        String strTwo = "We are accessing all elements at odd index";
        for (int i = 0; i <= strTwo.length()-1; i++) { // the -1 is necessary because array & string indices in Java start at 0, so last index of a string is always one less than its length.
            // -1 adjusts the loop to loop over the elements of the string from the first index(0) to the last index (one less than the length of the string), avoiding an IndexOutOfBoundsException
            if(i % 2 != 0) {
                System.out.println("Char at index " + i + " is " + strTwo.charAt(i));
            }
        }



//        Counting Frequency of a character in a String by Using the charAt() Method

        String strThree = "Counting frequency of a character in a string";
        int count = 0;
        for (int i = 0; i < strThree.length()-1; i++) {
            if (strThree.charAt(i) == 'a') {    // if statement checks if the current character is equal to 'a'. If it is,
                count++;    // count++ increments the value of count by 1
            }
        }
        System.out.println("Frequency of a is: " + count);



        // returns the index of the first occurrence of a certain substring
        // returns -1 if the substring is not found
//        int indexOf(String subString);     this method takes substring as an argument and returns the index of the first character of the substring

        String strFour = "This is indexOf method";
        // passing Substring
        int index = strFour.indexOf("method");  // returns the index
        System.out.println("index of substring " + index);




        // like indexOf, but starts the search from the end of the string.
//         int lastIndexOf(String subString);


        // returns the length of a string
//        int length();


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
    }
}
