package com.solutions;

import java.util.ArrayList;
import java.util.List;


public class solution21 {
    public static void main(String[] args) {
        int sumOfAmic = 0;
        List<Integer> amicable = new ArrayList<Integer>();
        for (int i = 1; i < 10000; i++) {
            if (SumOfDivider(SumOfDivider(i)) == i && SumOfDivider(i) != i)
                amicable.add(i);
        }
        for (int i : amicable) {
            sumOfAmic += i;
            System.out.println(i + " is amicable because (SumOfDivider(" + i + ")) = " + SumOfDivider(i) + " and its' sum of dividers is: " + SumOfDivider(SumOfDivider(i)));
        }
        System.out.println("sum: " + sumOfAmic);
    }

    public static int SumOfDivider(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++)
            if (num % i == 0)
                sum += i;
        return sum;
    }
}
