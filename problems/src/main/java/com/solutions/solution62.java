package com.solutions;

import java.math.BigInteger;
import java.util.*;

public class solution62 {
    public static void main(String[] args) {

        boolean solved = false;
        Map<String, Integer> cubicPerms = new HashMap<String, Integer>();
        for (int i = 1; !solved; i++) {
            String sorted = sortedDigits(BigInteger.valueOf(i).pow(3));
            int newPerms = (cubicPerms.containsKey(sorted) ? cubicPerms.get(sorted) : 0) + 1;
            if (newPerms == 5) {
                System.out.println(BigInteger.valueOf(i).pow(3));
                solved = true;
            }
            cubicPerms.put(sorted, newPerms);

        }


        solved = false;
        Map<String, List<Integer>> cubicPerms1 = new HashMap<String, List<Integer>>();
        for (int i = 1; !solved; i++) {
            String sorted = sortedDigits(BigInteger.valueOf(i).pow(3));
            if (!cubicPerms1.containsKey(sorted)) {
                List<Integer> perms = new ArrayList<Integer>();
                perms.add(i);
                cubicPerms1.put(sorted, perms);
            } else {
                List<Integer> perms = cubicPerms1.get(sorted);
                perms.add(i);
                if (perms.size() == 5) {
                    System.out.println(BigInteger.valueOf(perms.get(0)));
                    solved = true;
                }
                //cubicPerms.put(sorted, newPerms);
            }
        }


    }

    static String sortedDigits(BigInteger num) {
        char[] digits = num.toString().toCharArray();
        Arrays.sort(digits);
        String sorted = "";
        for (char digit : digits) {
            sorted += digit;
        }
        return sorted;
    }
}
