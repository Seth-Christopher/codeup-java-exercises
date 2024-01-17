package util;

public class FactorialAndOtherFunctions {

    public static long fact(long n) {
        // hallmark #2 (a way to stop)
        if(n == 1 || n == 2) {
            return n;
        }

        // hallmark #1 (answer is in smaller terms of itself)
        return n * fact(n - 1);
    }



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

    public static void main(String[] args) {
        System.out.println(fact(5)); // print 5!

        int myFactVal = 1;
        for (int i = 1; i <= 5; i++) {
            myFactVal *= i;
        }
        System.out.println(myFactVal);
    }

    public static int randomInt(int low, int high) {
        return (int) Math.floor(Math.random() * (high - low + 1) + low);
    }
}
