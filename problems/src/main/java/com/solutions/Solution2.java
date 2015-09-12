package com.solutions;

public class Solution2 {

    public static void main(String[] args) {
        long sum = 0;
        int firstNum;
        int secondNum = 1;
        for (int i = 1; i < 4000000; i = firstNum + secondNum) {
            if (i % 2 == 0)
                sum += i;        //add the fibbonachi number if its even
            firstNum = secondNum; // to calculate i (the current fibbonachi number)
            secondNum = i;
        }
        System.out.println(sum);
    }

}
