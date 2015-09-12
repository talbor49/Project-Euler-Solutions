package com.solutions;

import com.utils.EulerUtils;

import java.util.ArrayList;
import java.util.List;

public class solution18 {
    public static void main(String[] args) throws Exception {
        String text = EulerUtils.readFile("problem18.txt"); //read the triangle from a text file in "c:/users/tal/downloads/triangle.txt"
        String[] arr = text.split("\n");
        int[][] triangle = new int[100][100];
        for (int i = 0; i < arr.length; i++) {
            String[] nums = arr[i].split(" ");
            for (int j = 0; j < nums.length; j++) {
                triangle[i][j] = Integer.valueOf(nums[j]);
            }
        }

        triangle[1][0] += triangle[0][0];
        triangle[1][1] += triangle[0][0];
        for (int i = 2; i < triangle.length; i++)
            for (int j = 0; j < i + 1; j++) {
                if (j == 0)
                    triangle[i][j] += Math.max(triangle[i - 1][j], triangle[i - 1][j + 1]);
                else if (j == i)
                    triangle[i][j] += triangle[i - 1][j - 1];
                else
                    triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);

            }

        List<Integer> maximums = new ArrayList<Integer>();
        for (int j = 0; j < triangle.length; j++) {
            maximums.add(triangle[triangle.length - 1][j]);
        }
        int maximum = 0;
        for (int i : maximums)
            maximum = Math.max(maximum, i);
        System.out.println(maximum);

    }
}
