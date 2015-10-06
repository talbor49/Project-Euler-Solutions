package com.solutions;

public class solution44 {

    public static void main(String[] args) {
        int n1 = 1;
        loops:
        while (true) {
            n1++;
            long p1 = P(n1);
            for (int n2 = n1 - 1; n2 > 0; n2--) {
                long p2 = P(n2);
                long d = Math.abs(p1 - p2);
                long sum = p1 + p2;
                if (isPenta(sum) && isPenta(d)) {
                    System.out.println(d);
                    break loops;
                }
            }
        }
    }

    static boolean isPenta(long num) {
        double n = (Math.sqrt(24 * num + 1) + 1.0) / 6.0;
        return n == (int) n;
    }

    static long P(int n) {
        return n * (3 * n - 1) / 2;
    }

}
