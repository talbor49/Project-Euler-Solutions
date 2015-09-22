package com.solutions;

import com.utils.EulerUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution79 {

    public static void main(String[] args) {
        // 123
        // total 123
        // 245
        // total 12345
        // 435
        // total 12435
        Set<String> data = new HashSet<>(EulerUtils.readLines("problem79.txt"));
        List<Integer> digits = new ArrayList<>(25);
        for (String str : data) {
            int[] digs = EulerUtils.stringToIntArr(str);
            for (int i = 0; i < digs.length; i++) {
                if (!digits.contains(i)) {
                    digits.add(i);
                } else {
                    int[] afterDigits = new int[digs.length - i - 1];
                    int[] beforeDigits = new int[i];

                }
            }
        }
    }
}
