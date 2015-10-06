package com.solutions;

import java.math.BigInteger;


public class solution57 {
    public static void main(String[] args) {
        int count = 0;
        long start = System.currentTimeMillis();
        BigInteger p = new BigInteger("3");
        BigInteger q = new BigInteger("2");
        BigInteger temp;
        BigInteger TWO = new BigInteger("2");
        for (int n = 0; n < 1000; n++) {
            temp = p;
            p = p.add(q.multiply(TWO));
            q = q.add(temp);
            if (String.valueOf(p).length() > String.valueOf(q).length())
                count++;
        }
        System.out.println(count);
        System.out.println("solution57 took: " + (System.currentTimeMillis() - start) + " ms");
    }
}
