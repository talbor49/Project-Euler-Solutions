package com.solutions;

import com.utils.EulerUtils;

public class solution26 {
    public static void main(String[] args) {
        int max = 0;
        for (int i = 7; i < 1000; i++) {
            if (!EulerUtils.isPrime(i)) {
                continue;
            }
            String seq = "";
            int r = 1;
            do {
                int x = r * 10;
                int d = (x / i);
                seq += d;
                r = x % i;
            } while (r != 1);
            if (seq.length() > max) {
                max = seq.length();
            }
        }
        System.out.println(max);
    }
}
