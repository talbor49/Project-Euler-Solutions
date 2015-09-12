package com.solutions;

import com.utils.EulerUtils;

import java.util.Arrays;

public class solution22 {
    public static void main(String[] args) {
        long sum = 0;
        String text = EulerUtils.readFile("problem22.txt");
        String[] names = text.split("\",\"");
        names[0] = "MARY"; //because of the text.split has problems with splitting the first and last element,
        names[names.length - 1] = "ALONSO";// We insert them manually.
        Arrays.sort(names);
        int index = 1;
        for (String name : names) {
            sum += SumOfDigits(name) * index;
            index++;
        }
        System.out.println(sum);
    }

    public static int SumOfDigits(String str) {
        int sum = 0;
        char[] arr = str.toCharArray();
        for (char chr : arr)
            sum += (int) chr - 64; //65 is the value of A in ASCII
        return sum;
    }
}
