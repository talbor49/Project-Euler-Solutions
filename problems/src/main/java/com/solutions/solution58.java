package com.solutions;

import com.utils.EulerUtils;

import java.math.BigInteger;


public class solution58 {
    static BigInteger TWO = new BigInteger("2");

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int n = 0;
        double ratio = 1;
        long currnum = 1;
        int offjumps = 1;
        double numerator = 0;
        double denominator = 1;
        while (ratio >= 0.1) {
            n++;
            offjumps = n * 2;
            currnum += offjumps;
            denominator++;
            if (EulerUtils.isPrime(currnum))
                numerator++;
            currnum += offjumps;
            denominator++;
            if (EulerUtils.isPrime(currnum))
                numerator++;
            currnum += offjumps;
            denominator++;
            if (EulerUtils.isPrime(currnum))
                numerator++;
            currnum += offjumps;
            denominator++;
            ratio = numerator / denominator;
        }
        int sidelength = n * 2 + 1;
        System.out.println("ratio: " + ratio + ", n = " + n + " size of side: " + sidelength + " time took: " + (System.currentTimeMillis() - start) + " ms.");
    }
}
