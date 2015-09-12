package com.solutions;

import com.utils.EulerUtils;

import java.math.BigInteger;

public class Solution10 {
    public static void main(String[] args) {
        int LIMIT = 2000000;
        BigInteger sum = BigInteger.valueOf(2L);
        boolean[] primes = EulerUtils.sieveOfAtkins(LIMIT);
        for (int i = 3; i < LIMIT; i++) {
            if (primes[i]) {
                sum = sum.add(BigInteger.valueOf(i));
            }
        }
        System.out.println(sum);
    }
}
