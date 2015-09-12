package com.solutions;

import com.utils.EulerUtils;

import java.math.BigInteger;


public class solution55 {
    public static void main(String[] args) {
        BigInteger i;
        int count = 0;
        BigInteger thousand = new BigInteger("10000");
        for (i = BigInteger.ONE; i.compareTo(thousand) == -1; i = i.add(BigInteger.ONE)) {
            if (lychrel(i)) {
                count++;
            }
        }
        System.out.println(count);

    }

    static boolean lychrel(BigInteger num) {
        for (int iteration = 0; iteration < 50; iteration++) {
            num = num.add(EulerUtils.BigInteger_reverse(num));
            if (EulerUtils.isPalindrome(num.toString())) {
                return false;
            }
        }
        return true;
    }


}
