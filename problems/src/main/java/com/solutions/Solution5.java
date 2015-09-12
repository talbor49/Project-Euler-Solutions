package com.solutions;

public class Solution5 {
    public static void main(String[] args) {
        long num;
        for (num = 1; !divisible(num, 20); num++) {
        } //Increment num until its divisble
        System.out.println(num);
    }

    public static boolean divisible(long num, int limit) {
        for (int i = 2; i <= limit; i++) {
            if (num % i != 0)
                return false;
        }
        return true;
    }


}
