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
