package com.solutions;

import com.utils.EulerUtils;

import java.util.HashSet;

public class solution47 {
    static final int N = 4;

    public static void main(String[] args) {
        for (int i = 10; true; i++) {
            boolean containsNprimeFacs = new HashSet<>(EulerUtils.primeFactors(i)).size() == N;
            boolean containsNprimeFacs2 = new HashSet<>(EulerUtils.primeFactors(i + 1)).size() == N;
            boolean containsNprimeFacs3 = new HashSet<>(EulerUtils.primeFactors(i + 2)).size() == N;
            boolean containsNprimeFacs4 = new HashSet<>(EulerUtils.primeFactors(i + 3)).size() == N;
            if (containsNprimeFacs4 && containsNprimeFacs3 && containsNprimeFacs2 && containsNprimeFacs) {
                System.out.println(i);
                break;
            }

        }

    }

}
