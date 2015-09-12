package com.solutions;

import static com.utils.EulerUtils.isPrime;

public class solution37 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 10; i < 1000000; i++)
            if (truncatable(i))
                sum += i;
        System.out.println(sum);
    }

    static boolean truncatable(int num) {
        if (!isPrime(num))
            return false;
        String str = String.valueOf(num);
        for (int i = str.length(); i > 0; i--)
            if (!isPrime(Integer.valueOf(str.substring(0, i))))
                return false;
        for (int i = 0; i < str.length(); i++)
            if (!isPrime(Integer.valueOf(str.substring(i))))
                return false;
        return true;
    }
}
