package com.solutions;

import com.utils.EulerUtils;

public class solution43 {
    static int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71};

    public static void main(String[] args) {
        long sum = 0;
        for (Long i : EulerUtils.permutatations("1234567890")) {
            if (eligible(String.valueOf(i))) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }

    static boolean eligible(String num) {
        if (EulerUtils.zeroToNinePandigital(String.valueOf(num))) {
            int indexor = 0;
            int divisor = 1;
            while (divisor < String.valueOf(num).length() - 2) {
                if (!(Integer.valueOf(String.valueOf(num).substring(divisor, divisor + 3)) % primes[indexor] == 0))
                    return false;
                divisor++;
                indexor++;
            }
            return true;
        }
        return false;
    }

}
