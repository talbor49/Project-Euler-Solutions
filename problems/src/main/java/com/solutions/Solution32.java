package com.solutions;

import com.utils.EulerUtils;

import java.util.HashSet;
import java.util.Set;

public class Solution32 {
    public static void main(String[] args) {
        EulerUtils.oneToNinePandigital("123456789");
        int LIMIT = 10000;
        Set<Long> nums = new HashSet<>();
        for (int multiplier = 1; multiplier < LIMIT; multiplier++) {
            for (int multiplicand = multiplier; multiplicand < LIMIT; multiplicand++) {
                long product = multiplier * multiplicand;
                String total = (multiplicand + "") + (multiplier + "") + (product + "");
                if (total.length() == 9 && EulerUtils.oneToNinePandigital(total)) {
                    nums.add(product);
                }
            }
        }
        long sum = 0;
        for (long num : nums) {
            sum += num;
        }
        System.out.println(sum);
    }
}
