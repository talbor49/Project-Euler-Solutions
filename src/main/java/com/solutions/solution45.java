package com.solutions;

import com.utils.EulerUtils;

public class solution45 {
    public static void main(String[] args) {
        for (long i = 40755 + 2; true; i++) {
            if (EulerUtils.isTriangle(i) && EulerUtils.isPenta(i) && EulerUtils.isHexa(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}
