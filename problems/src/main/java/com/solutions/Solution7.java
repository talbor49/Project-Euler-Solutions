package com.solutions;

import com.utils.EulerUtils;

public class Solution7 {
    public static void main(String[] args) {
        int num;
        int primes = 0;
        for (num = 1; primes != 10001; num++) {
            if (EulerUtils.isPrime(num)) {
                primes++;
            }
        }
        System.out.println(num - 1); //for loop incremented the right num
    }
}