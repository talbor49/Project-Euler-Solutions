package com.solutions;

import com.utils.EulerUtils;

import java.math.BigInteger;

public class solution56 {
    public static void main(String[] args) {
        long maximumdigitsum = 0;
        long start = System.currentTimeMillis();
        BigInteger exponent = new BigInteger("1");
        for (int a = 1; a < 100; a++)
            for (int b = 1; b < 100; b++) {
                exponent = BigInteger.valueOf(a);
                exponent = exponent.pow(b);
                long thisdigitsum = EulerUtils.sumOfDigits(exponent.toString());
                if (thisdigitsum > maximumdigitsum)
                    maximumdigitsum = thisdigitsum;
            }
        System.out.println(maximumdigitsum);
        System.out.println(System.currentTimeMillis() - start);
    }
}
