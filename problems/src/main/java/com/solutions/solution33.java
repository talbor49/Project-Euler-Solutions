package com.solutions;

import java.util.ArrayList;
import java.util.List;

public class solution33 {

    public static void main(String[] args) {
        List<Integer> thechosen4num = new ArrayList<>();
        List<Integer> thechosen4den = new ArrayList<>();
        for (int numerator = 10; numerator < 100; numerator++) {
            for (int denominator = numerator + 1; denominator < 100; denominator++) {
                if (numerator / (denominator + 0.0) >= 1)
                    continue;
                int numerator1 = numerator / 10;
                int numerator2 = numerator % 10;
                int denominator1 = denominator / 10;
                int denominator2 = denominator % 10;
                if (numerator1 / (denominator1 + 0.0) == numerator / (denominator + 0.0) && numerator2 == denominator2 && denominator2 != 0) {
                    thechosen4num.add(numerator);
                    thechosen4den.add(denominator);
                }
                if (numerator1 / (denominator2 + 0.0) == numerator / (denominator + 0.0) && numerator2 == denominator1 && denominator1 != 0) {
                    thechosen4num.add(numerator);
                    thechosen4den.add(denominator);
                }
                if (numerator2 / (denominator1 + 0.0) == numerator / (denominator + 0.0) && numerator1 == denominator2 && denominator2 != 0) {
                    thechosen4num.add(numerator);
                    thechosen4den.add(denominator);
                }
                if (numerator2 / (denominator2 + 0.0) == numerator / (denominator + 0.0) && numerator1 == denominator1 && denominator1 != 0) {
                    thechosen4num.add(numerator);
                    thechosen4den.add(denominator);
                }

            }
        }
        for (int i = 0; i < thechosen4num.size(); i++) {
            System.out.println(String.valueOf(thechosen4num.get(i)) + "/" + String.valueOf(thechosen4den.get(i)));
        }
        //then i just multiplied all of the numbers in my calculator and the denominator is the answer(i got 1/100)
    }

}
