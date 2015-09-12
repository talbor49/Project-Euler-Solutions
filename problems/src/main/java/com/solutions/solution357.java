package com.solutions;

import com.utils.EulerUtils;

public class solution357 {
    static int limitNum = 100000000;
    static boolean[] isPrime = EulerUtils.sieveOfAtkins(limitNum + 5);

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for (int i = 1; i <= limitNum; i++) {
            if (isPrime[i + 1])
                if (primeGenerating(i)) {
                    sum += i;
                }
        }
        System.out.println("sum: " + sum + " , the solution took: " + (System.currentTimeMillis() - startTime) + " milliseconds");

    }

    static boolean primeGenerating(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                if (!isPrime[i + n / i])
                    return false;
        return true;
    }
}
