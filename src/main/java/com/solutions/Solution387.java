package com.solutions;

import com.utils.EulerUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.jar.Pack200;

public class Solution387 {

    public static void main(String[] args) {
        /*
        Strategy:
        find all possible sum of digits untill number, multiply them in prime number. if harshad, its strong.
        add a digit(only prime- suitable digits), if prime, and harshad is right-sequential, then bingo.


        NUM = 1000
        maxDigitsNumber = 999
        maxDigitsSum = 3 * 9
         */
        long MAX = (long) Math.pow(10, 7);

        long sum = 0;
        int maxDigitsSum = String.valueOf(MAX-1).length() * 9;
        for(int i = 1; i < maxDigitsSum; i++) {
            for (int mul = 1; i * mul * 10 < MAX; mul++) {
                int newNum = i * mul;
                if (EulerUtils.sumOfDigits(newNum) == i && EulerUtils.isPrime(mul)
                        && rightTruncatable(newNum) && hasPrimeBro(newNum)) {

                    int[] possibleDigits = {1, 3, 7, 9};
                    for (int possibleDigit : possibleDigits) {
                        if ( (newNum*10 + possibleDigit) <= MAX
                             && EulerUtils.isPrime(newNum * 10 + possibleDigit)) {
                            sum += newNum*10 + possibleDigit;
                        }
                    }
                }
            }
        }
        System.out.println("sum: " + sum);

//        for(long i = 10; i < MAX; i++) {
//            if (EulerUtils.isPrime(i) && isStrongHarshad(i/10) && rightTruncatable(i/10)) {
//                sumNums += i;
//                harshads.remove(i);
//                countHarshads++;
//            }
//        }
//        System.out.println(sum);
    }
    public static boolean isHarshad(long num) {
        return num % EulerUtils.sumOfDigits(num) == 0;
    }
    public static boolean isStrongHarshad(long num) {
        return isHarshad(num) && EulerUtils.isPrime(num / EulerUtils.sumOfDigits(num));
    }

    static boolean rightTruncatable(long num) {
        while(num != 0) {
            if ( !isHarshad(num))
                return false;
            num /= 10;
        }
        return true;
    }

    public static boolean hasPrimeBro(long num) {
        int[] possibleDigits = {1, 3, 7, 9};
        for (int possibleDigit : possibleDigits) {
            if (EulerUtils.isPrime(num * 10 + possibleDigit)) {
                return true;
            }
        }
        return false;
    }

}
