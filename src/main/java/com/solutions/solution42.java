package com.solutions;

import com.utils.EulerUtils;

public class solution42 {
    static int[] trianglenums = new int[100];

    public static void main(String[] args) {
        for (int i = 0; i < trianglenums.length; i++)
            trianglenums[i] = (int) ((0.5 * (i + 1)) * (i + 2));
        String content = EulerUtils.readFile("problem42.txt");
        content = content.replace("\"", "");
        String[] words = content.split(",");
        int count = 0;
        for (String i : words)
            if (triangleWord(i.toLowerCase()))
                count++;
        System.out.println(count);
        System.out.println(triangleWord("sky"));
    }

    static boolean triangleWord(String word) {
        int sum = 0;
        for (char i : word.toCharArray())
            sum += locationInAbc(i);
        return contains(trianglenums, sum);
    }

    static boolean contains(int[] arr, int num) {
        boolean conts = false;
        for (int a : arr)
            if (a == num)
                conts = true;
        return conts;
    }

    static int locationInAbc(char letter) {
        int asciiValue = (int) letter;
        return asciiValue - 96; //97 is ASCII value of a
    }
}