package com.solutions;

import com.utils.EulerUtils;

public class solution12 {
    public static void main(String[] args) {
        int index = 2;
        int triangleNum = 1;
        while (EulerUtils.numOfDividers(triangleNum) <= 500) {
            triangleNum += index;
            index++;
        }
        System.out.println(triangleNum);
    }
}
