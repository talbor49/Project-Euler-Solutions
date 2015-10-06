package com.solutions;

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solve(1, 1000));
    }

    public static int solve(int current, int max) {
        // ;P
        return current <= max ?
                current % 3 == 0 || current % 5 == 0 ?
                        current + solve(current + 1, max) :
                        solve(current + 1, max) :
                current % 3 == 0 || current % 5 == 0 ?
                        current : 0;
    }
}
