package com.solutions;

import com.utils.EulerUtils;

public class Solution15 {
    public static void main(String[] args) {
        /**
         * To get from the upper left to the bottom right conrner of the grid, you need to move 20 times left and 20 times right.
         * No matter in what order you do this, you will reach the bottom right corner.
         * Which means, the amount of ways to get there is the amount of ways we can move 20 times left and 20 times right.
         * We can look at it like the amount of ways to sort 20 zeros and 20 ones.
         * There is a formula for it, its called nCr - N choose R.
         */
        System.out.println(EulerUtils.BigInteger_nCr(40, 20).toString());
    }
}
