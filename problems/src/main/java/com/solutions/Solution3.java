package com.solutions;

import com.utils.EulerUtils;

public class Solution3 {
    public static void main(String[] args) {
        long largestDivisor = 0;
        long num = 600851475143L;
        for (long i = 1; i <= (int) (Math.sqrt(num)) + 1; i++) {
            if (num % i == 0 && EulerUtils.isPrime(i) && i > largestDivisor) { // If i is a divisor, bigger than lastDivisor and prime, set largestDivisor to i.
                largestDivisor = i;
            }

        }
        System.out.println(largestDivisor);
    }
}
