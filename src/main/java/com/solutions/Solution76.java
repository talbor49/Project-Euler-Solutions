package com.solutions;

import java.util.*;

public class Solution76 {

    public static final int LIMIT = 100;

    public static long[] waysToWrite = new long[LIMIT+1];

    public static void main(String[] args) {
        waysToWrite[0] = 1;
        for(int i = 1;i < LIMIT; i++) {
            for(int j = i; j < waysToWrite.length; j++) {
                waysToWrite[j] += waysToWrite[j-i];
            }
        }
        System.out.println(waysToWrite[100]);
    }

}
