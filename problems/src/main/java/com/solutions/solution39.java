package com.solutions;

import java.util.HashSet;
import java.util.Set;

public class solution39 {
    public static void main(String[] args) {
        int maxoptions = 0;
        int maxp = 0;
        for (int p = 1; p <= 1000; p++) {
            int opts = options(p);
            if (opts > maxoptions) {
                maxoptions = opts;
                maxp = p;
            }
        }
        System.out.println(maxp);

    }

    static int options(int p) {
        Set<String> abc = new HashSet<String>();
        for (int a = 1; a <= p; a++)
            for (int b = 1; a + b < p; b++) {
                int c = (int) Math.sqrt(a * a + b * b);
                if (areTriangleSides(a, b, c) && a + b + c == p) {
                    int smaller = Math.min(a, b);
                    int bigger = Math.max(a, b);
                    abc.add(smaller + "," + bigger);
                }
            }
        for (String i : abc)
            System.out.println(i);
        return abc.size();


    }

    static boolean areTriangleSides(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a && c == Math.sqrt(a * a + b * b);
    }
}
