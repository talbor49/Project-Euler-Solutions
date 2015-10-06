package com.solutions;

import com.utils.EulerUtils;

public class solution38 {
    public static void main(String[] args) {
        long maxpan = 0;
        for (int n = 2; n < 10; n++)
            for (int i = 1; concProduct(i, n) < 1000000000; i++) {
                long all = concProduct(i, n);
                if (EulerUtils.oneToNinePandigital(String.valueOf(all)))
                    if (all > maxpan) {
                        maxpan = all;
                    }

            }
        System.out.println(maxpan);
    }

    static long concProduct(int i, int n) {
        String sum = "";
        for (int n2 = 1; n2 <= n; n2++)
            sum += i * n2;
        return Long.valueOf(sum);
    }
}
