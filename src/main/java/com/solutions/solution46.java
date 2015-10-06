package com.solutions;

public class solution46 {

    public static void main(String[] args) {
        boolean notfound = true;
        for (int i = 2; true; i++) {
            if (!isPrime(i) && i % 2 == 1) {
                if (!canBeWrittenAsSumOfPrimeAndTwiceASquare(i)) {
                    System.out.println(i);
                    break;
                }
            }

        }
    }

    static boolean canBeWrittenAsSumOfPrimeAndTwiceASquare(int num) {
        for (int prime = 1; prime < num; prime++)
            for (int square = 1; square * square < num; square++) {
                if (isPrime(prime) && 2 * square * square + prime == num)
                    return true;
            }
        return false;

    }

    static boolean isPrime(int num) {
        if (num == 1)
            return false;
        if (num == 2)
            return true;
        for (int i = 2; i < Math.sqrt(num) + 1; i++)
            if (num % i == 0)
                return false;
        return true;

    }

}
