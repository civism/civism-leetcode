package com.civism.leetcode;

public class Leetcode35 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        int index = searchInsert(nums, target);
        System.out.println(index);
    }


    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
                if (left >= nums.length || nums[left] > target) {
                    return left;
                }
            } else {
                right = middle - 1;
                if (middle==0 || nums[right] < target) {
                    return middle;
                }
            }

        }
        return 0;
    }
}
