package com.solutions;

import com.utils.EulerUtils;

public class solution27 {

    public static void main(String[] args) {
        int maxA = 0, maxB = 0, maxCount = 0, count = 0;
        for (int a = -1000; Math.abs(a) <= 1000; a++)
            for (int b = -1000; Math.abs(b) <= 1000; b++) {
                count = 0;
                for (int n = 0; EulerUtils.isPrime(Math.abs(n * n + a * n + b)); n++) {
                    count++;
                }
                if (count > maxCount) {
                    maxCount = count;
                    maxA = a;
                    maxB = b;
                }
            }
        System.out.println(maxA * maxB);
    }

}
