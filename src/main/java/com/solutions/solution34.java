package com.solutions;

public class solution34 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 3; i < 10000000; i++) {
            double isum = factorialNum(i);
            if (isum == i)
                sum += isum;
        }
        System.out.println(sum);
    }

    static double factorial(int num) {
        double sum = 1;
        for (int i = 2; i <= num; i++)
            sum *= i;
        return sum;
    }

    static double factorialNum(double num) {
        double sum = 0;
        char[] numbers = String.valueOf(num).toCharArray();
        for (char numbc : numbers) {
            if (numbc == '.')
                break;
            sum += factorial(Integer.valueOf(String.valueOf(numbc)));
        }
        return sum;
    }
}
