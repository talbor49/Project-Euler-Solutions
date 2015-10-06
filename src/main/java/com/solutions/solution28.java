package com.solutions;

public class solution28 {
    public static void main(String[] args) {
        final int size = 1001;
        int n = 1;
        long sum = 0;
        int jumps = 0;
        for (int i = 1; i <= size; i += 2) {
            while (n <= i * i) {
                sum += n;
                if (n != i * i)
                    n += jumps;
                else {
                    jumps += 2;
                    n += jumps;
                }
            }
        }
        System.out.println(sum);
    }
}
