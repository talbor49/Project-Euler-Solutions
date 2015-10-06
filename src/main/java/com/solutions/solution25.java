package com.solutions;

import java.math.BigInteger;

public class solution25 {
    public static void main(String[] args) {
        int count = 3;
        BigInteger first = BigInteger.ONE;
        BigInteger second = BigInteger.valueOf(2);
        BigInteger third = BigInteger.TEN;
        //minimum value of a 1000 digit number is 1 + 999 zeroes after him, which is 1 * 10^99;
        BigInteger maxValue = BigInteger.TEN.pow(999);
        while (third.compareTo(maxValue) < 0) {
            third = first.add(second);
            first = second;
            second = third;
            count++;
        }
        System.out.println(count);
    }


}
