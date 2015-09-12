package com.solutions;

import com.utils.EulerUtils;

import java.math.BigInteger;

public class solution16 {
    public static void main(String[] args) {
        BigInteger big = BigInteger.valueOf(2L);
        big = big.pow(1000);
        System.out.println(EulerUtils.sumOfDigits(big.toString()));
    }
}
