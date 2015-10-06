package com.solutions;

public class solution24 {

    public static void main(String[] args) {
        // Don't laugh, skip to the next solution
        int count = 0;
        for (int a = 0; a <= 9; a++)
            for (int b = 0; b <= 9; b++)
                for (int c = 0; c <= 9; c++)
                    for (int d = 0; d <= 9; d++)
                        for (int e = 0; e <= 9; e++)
                            for (int f = 0; f <= 9; f++)
                                for (int g = 0; g <= 9; g++)
                                    for (int h = 0; h <= 9; h++)
                                        for (int i = 0; i <= 9; i++)
                                            for (int j = 0; j <= 9; j++)
                                                if (j != a && j != b && j != c && j != d && j != e && j != f && j != g && j != h && j != i && b != a && c != b && c != a && d != a && d != b && d != c && e != a && e != b && e != c && e != d && f != a && f != b && f != c && f != d && f != e && g != a && g != b && g != c && g != d && g != e && g != f && h != a && h != b && h != c && h != d && h != e && h != f && h != g && i != a && i != b && i != c && i != d && i != e && i != f && i != g && i != h) {
                                                    count++;
                                                    if (count == 1000000)
                                                        System.out.println(String.valueOf(a) + String.valueOf(b) + String.valueOf(c) + String.valueOf(d) + String.valueOf(e) + String.valueOf(f) + String.valueOf(g) + String.valueOf(h) + String.valueOf(i) + String.valueOf(j));
                                                }
    }

}
