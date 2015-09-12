package com.solutions;

import com.utils.EulerUtils;


public class solution49 {

    public static void main(String[] args) {
        for (int num1 = 1000; num1 < 10000; num1++)
            if (EulerUtils.isPrime(num1)) {
                for (int jumps = 1; num1 + 2 * jumps < 10000; jumps++) {
                    int num2 = num1 + jumps;
                    int num3 = num2 + jumps;
                    if (EulerUtils.isPrime(num2) && EulerUtils.isPrime(num3) && EulerUtils.sameDigits(num2, num3) && EulerUtils.sameDigits(num1, num2))
                        System.out.println("" + num1 + num2 + num3);
                }
            }
    }

}
