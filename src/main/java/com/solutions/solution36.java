package com.solutions;

import com.utils.EulerUtils;

public class solution36 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < 1000000; i++)
            if (EulerUtils.isPalindrome(String.valueOf(i)) && EulerUtils.isPalindrome(removeZeroes(Integer.toBinaryString(i))))
                sum += i;
        System.out.println(sum);
    }

    public static String removeZeroes(String num) {
        for (int i = 0; i < num.length(); i++)
            if (num.charAt(i) == 0)
                num = num.substring(i);
            else
                return num;
        return "ERROR";
    }
}
