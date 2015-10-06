package com.solutions;

import com.utils.EulerUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution51 {
    public static void main(String[] args) {
        int count;
        for (int num = 100000; num < 1000000; num++) {
            for (int i = 0; i < 3; i++) {
                count = 0;
                for (int[] indexes : possibleIndexes(String.valueOf(num).length(), 3)) {
                        long newNum = replaceIndexes(num, indexes, i);
                        if (EulerUtils.isPrime(newNum))
                            count++;
                }
                if (count == 8) {
                    System.out.println(num);
                }
            }
        }
    }

    private static List<int[]> possibleIndexes(int length, int digitsToSwitch) {
        List<int[]> indexes = new ArrayList<>();
        int[] flags = new int[length];
        indexes.add(flags);
        int[] spaces = new int[digitsToSwitch];
        int currentIndex;
        while(true) {
            Arrays.fill(flags, 0);
            while (sumOfArr(spaces) < length) {
                for (int startingIndex = 0; startingIndex < length - sumOfArr(spaces); startingIndex++) {
                    currentIndex = startingIndex;
                    for (int i = 0; i < digitsToSwitch; i++) {
                        flags[currentIndex] = 1;
                        currentIndex += spaces[i];
                    }
                    indexes.add(flags);
                }
            }
            break;
        }
        return indexes;
    }

    private static int sumOfArr(int[] arr) {
        int sum = 0;
        for (int anArr : arr) sum += anArr;
        return sum;
    }

    private static long replaceIndexes(int num, int[] indexes, int numToInsert) {
        char[] digs = String.valueOf(num).toCharArray();
        for (int index : indexes) {
            digs[index] = (char) numToInsert;
        }
        return 0;
    }
}
