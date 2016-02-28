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
        long MAX = (long) Math.pow(10, 8);

        long sum = 0;
        int maxDigitsSum = String.valueOf(MAX-1).length() * 9;
        // I get the same result when starting from digitsSum 3 as in when i start from 2 or 1. If mistake, change back
        for(int digitsSum = 3; digitsSum < maxDigitsSum; digitsSum++) {

            long newNum2 = digitsSum * 2;
            if (EulerUtils.sumOfDigits(newNum2) == digitsSum && EulerUtils.isPrime(2)
                    && rightTruncatable(newNum2)) {

                int[] possibleDigits = {1, 3, 7, 9};
                for (int possibleDigit : possibleDigits) {
                    long theNumber = newNum2*10 + possibleDigit;
                    if ( theNumber <= MAX
                            && EulerUtils.isPrime(theNumber)) {
                        sum += theNumber;
                    }
                }
            }

            for (long mul = 3; digitsSum * mul * 10 < MAX; mul+= 2) {
                long newNum = digitsSum * mul;
                if (EulerUtils.sumOfDigits(newNum) == digitsSum && EulerUtils.isPrime(mul)
                        && rightTruncatable(newNum)) {

                    int[] possibleDigits = {1, 3, 7, 9};
                    for (int possibleDigit : possibleDigits) {
                        long theNumber = newNum*10 + possibleDigit;
                        if ( theNumber <= MAX
                             && EulerUtils.isPrime(theNumber)) {
                            sum += theNumber;
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
