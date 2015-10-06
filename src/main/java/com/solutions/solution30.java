package com.solutions;

public class solution30 {
    public static void main(String[] args) {
        final int power = 4;
        int globalSum = 0;
        // 7 digits sounds like a reasonable limit :P
        for (int i = 2; i < 1000000; i++) {
            int sum = 0;
            char[] nums = String.valueOf(i).toCharArray();
            for (char j : nums) {
                sum += Math.pow(Integer.valueOf(String.valueOf(j)), 5);
            }
            if (sum == i) {
                globalSum += sum;
            }
        }
        System.out.println("sum:" + globalSum);
    }
}
