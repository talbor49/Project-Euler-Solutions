package com.solutions;

import com.utils.EulerUtils;

import java.util.ArrayList;
import java.util.List;

public class Solution4 {
    public static void main(String[] args) {
        List<Long> palindromes = new ArrayList<Long>();
        for (int i = 100; i < 1000; i++)
            for (int j = 100; j < 1000; j++) {
                if (EulerUtils.isPalindrome(i * j)) {
                    palindromes.add((long) (i * j));
                }
            }
        long maxPal = 0;
        for (long p : palindromes) {
            if (p > maxPal)
                maxPal = p;
        }
        System.out.println(maxPal);
    }


}
