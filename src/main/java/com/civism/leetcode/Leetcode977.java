package com.civism.leetcode;

import java.util.Arrays;

public class Leetcode977 {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        int[] ints = sortedSquares(nums);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] sortedSquares(int[] nums) {
        int i = 0, j = nums.length - 1, k = nums.length-1;
        int[] result = new int[nums.length];
        while (i <= j) {
            if (nums[i] * nums[i] < nums[j] * nums[j]) {
                result[k--] = nums[j] * nums[j];
                j--;
            } else {
                result[k--] = nums[i] * nums[i];
                i++;
            }
        }
        return result;
    }
}
