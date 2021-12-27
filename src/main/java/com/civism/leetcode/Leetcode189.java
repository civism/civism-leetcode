package com.civism.leetcode;

import java.util.Arrays;

public class Leetcode189 {
    public static void main(String[] args) {
        int[] nums = {-1};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        resert(nums,0,nums.length-1);
        resert(nums,0,k%nums.length-1);
        resert(nums,k%nums.length,nums.length-1);
    }

    public static void resert(int[] nums,int start,int end) {
        for (int i = start, j = end; i < j; i++,j--) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
    }
}
