package com.solutions;

public class solution40 {

    public static void main(String[] args) {
        int[] nums = new int[1000009];
        nums[1000008] = -1;
        int value = 1;
        int index = 0;
        while (nums[1000008] == -1) {
            for (char i : String.valueOf(value).toCharArray()) {
                if (index == nums.length)
                    break;
                nums[index] = Integer.valueOf(String.valueOf(i));
                index++;
            }
            value++;
        }
        System.out.println(nums[0] * nums[9] * nums[99] * nums[999] * nums[9999] * nums[99999] * nums[999999]);
    }


}
