package com.solutions;

import com.utils.EulerUtils;

public class solution41 {

    public static void main(String[] args) {
        int maxPan = 0;
        for (int i = 100; i < 100000000; i++)
            if (EulerUtils.oneToNinePandigital(String.valueOf(i)))
                if (i > maxPan && EulerUtils.isPrime(i)) {
                    maxPan = i;
                }
        System.out.println(maxPan);
    }
}
