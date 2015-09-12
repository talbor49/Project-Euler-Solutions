package com.solutions;

import com.utils.EulerUtils;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class solution23 {
    public static void main(String[] args) {
        List<Integer> canBe = new ArrayList<Integer>();
        List<Integer> abundant = new ArrayList<Integer>();
        // Make a list of all the abundant numbers
        for (int i = 1; i <= 28123; i++) {
            long num = EulerUtils.sumOfDividers(i);
            if (num > i) {
                abundant.add(i);
            }
        }

        int size = abundant.size();
        for (int i = 0; i < size && abundant.get(i) < 28123; i++) {
            for (int j = i; j < size && abundant.get(j) < 28123; j++) {
                if (abundant.get(i) + abundant.get(j) <= 28123) {
                    canBe.add(abundant.get(i) + abundant.get(j));
                } else {
                    break;
                }

            }
        }

        Set<Integer> unique = new LinkedHashSet<>(canBe);
        canBe.clear();
        canBe.addAll(unique);
        int sum = 0;
        for (int i = 1; i <= 28123; i++) {
            if (!canBe.contains(i)) {
                sum += i;
            }
        }
        System.out.println(sum);

    }
}
