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


        //---------- STRING MANIPULATION METHODS ----------- \\

        // the following methods can be used to manipulate strings \\


        // returns the character at the specified index of the string.
//        char charAt (int index);

        // returns the index of the first occurrence of a certain substring
        // returns -1 if the substring is not found
//        int indexOf(String subString);


        // like indexOf, but starts the search from the end of the string.
//         int lastIndexOf(String subString);

        // returns the length of a string
//        int length();

        // returns a copy of the string that has pattern replaced with replacement
//        String replace(String pattern, String replacement);




    }
}
