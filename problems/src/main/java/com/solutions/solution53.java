package com.solutions;

import com.utils.EulerUtils;

import java.math.BigInteger;

public class solution53 {
    public static void main(String[] args) {
        int count = 0;
        int result;
        long start = System.currentTimeMillis();
        for (int n = 1; n <= 100; n++) {
            for (int r = 1; r <= n; r++) {
                BigInteger thisncr = EulerUtils.BigInteger_nCr(n, r);
                result = thisncr.compareTo(BigInteger.valueOf(1000000));
                if (result == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println("Time elapsed: " + (System.currentTimeMillis() - start) + " ms");
    }


}
