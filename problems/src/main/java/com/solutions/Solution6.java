package com.solutions;

public class Solution6 {
    public static void main(String[] args) {
        long sum = 0;
        long product = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            product += i * i;
        }
        sum *= sum;
        System.out.println(sum - product);
    }
}
