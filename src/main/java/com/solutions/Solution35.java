package com.solutions;

public class Solution35 {
    public static void main(String[] args) {
        int limit = 1000000;
        int count = 0;
        boolean[] numbers = arePrimes(limit);
        for (int i = 1; i < numbers.length; i++) {
            boolean circPrime = true;
            for (int j = 0; j < String.valueOf(i).length(); j++) {
                String k = String.valueOf(i);
                if (!numbers[Integer.valueOf(k.substring(j) + k.substring(0, j))])
                    circPrime = false;
            }
            if (circPrime)
                count++;
        }
        System.out.println(count);
    }

    public static boolean isPrime(int num) {
        if (num == 1) return false;
        else if (num == 2) return true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static boolean[] arePrimes(int limit) {
        boolean[] areprimes = new boolean[limit];
        areprimes[0] = false;
        for (int i = 1; i < limit; i++)
            areprimes[i] = isPrime(i);
        return areprimes;
    }
}

