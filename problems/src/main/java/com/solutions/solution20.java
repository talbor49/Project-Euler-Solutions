package com.solutions;

import java.math.BigInteger;

public class solution20 {
    public static void main(String[] args) {
        BigInteger big = BigInteger.valueOf(100L);

        for (int i = 100; i > 1; i--) {
            big = big.multiply(BigInteger.valueOf((long) i));
        }
        System.out.println(sumOfDigits(big));

    }

    public static int sumOfDigits(BigInteger big) {
        int sum = 0;
        String num = String.valueOf(big);
        char[] nums = num.toCharArray();
        for (char i : nums) {
            String number = String.valueOf(i);
            sum += Integer.valueOf(number);
        }
        return sum;
    }

}
