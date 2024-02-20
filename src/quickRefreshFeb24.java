public class quickRefreshFeb24 {
    public static void main(String[] args) {
        // Variables in java must be declared before they are used.
        // includes a type for the variable, as well as a name (a valid identifier) for the variable.
        // examples of variable declaration \\
        int id = 123;
        boolean isLoggedIn = false;
        double bankAccountBalance = 1000.23;

//    Create an int variable named myFavoriteNumber and assign your favorite number to it.
        int myFavoriteNumber = 2;


//     Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Hello World.";
        System.out.println(myString);

//    Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        double myNumber = 23;
        System.out.println(myNumber);
//    Change your code to assign the value 3.14 to myNumber. What do you notice?

        myNumber = 3.14;
        System.out.println(myNumber);
//    Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        myNumber = 123L;
        System.out.println(myNumber);
//    Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        myNumber = (float) 3.14;
        System.out.println(myNumber);
        System.out.printf("%.2f %n", myNumber);    // using souf, and %.2 for how many decimal spaces


        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;


    }
}
