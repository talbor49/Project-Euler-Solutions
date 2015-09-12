package com.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class solution29 {

    public static void main(String[] args) {
        final int size = 100;
        List<Double> seqs = new ArrayList<Double>();
        for (int a = 2; a <= size; a++)
            for (int b = 2; b <= size; b++)
                seqs.add(Math.pow(a, b));


        Set<Double> foo = new HashSet<>(seqs);
        System.out.println(foo.size());
    }

}
