package com.solutions;

import java.math.BigInteger;

public class solution206 {

    public static void main(String[] args) {
        BigInteger square;
        for (BigInteger i = BigInteger.valueOf((long) Math.sqrt(1020304050607080900L)); true; i = i.add(BigInteger.ONE)) {
            square = i.multiply(i);
            if (valid(square.toString())) {
                System.out.println(square);
                System.out.println(i);
                break;

            }
        }
    }

    static boolean valid(String num) {
        int length = num.length();
        if (length != 19)
            return false;
        if (num.charAt(18) != '0')
            return false;
        for (int i = 0; i < length - 1; i += 2) {
            if ((Integer.valueOf(String.valueOf(num.charAt(i))) - 1) * 2 != ((i))) {
                return false;
            }
        }
        return true;
    }
}
