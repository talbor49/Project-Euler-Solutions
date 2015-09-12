package com.solutions;

public class solution9 {
    public static void main(String[] args) {
        loops:
        for (int a = 1; a < 1000; a++)
            for (int b = 1; b < 1000; b++)
                for (int c = 1; c < 1000; c++)
                    if (a * a + b * b == c * c && a < b && b < c) {
                        if (a + b + c == 1000) {
                            System.out.println("The pythagoran triplet that matches is: a = " + a + ", b = " + b + ", c = " + c);
                            System.out.println("Their product is " + (a * b * c));
                            break loops;
                        }
                    }
    }
}
