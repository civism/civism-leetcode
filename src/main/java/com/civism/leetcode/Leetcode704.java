package com.civism.leetcode;

import java.util.Arrays;

public class Leetcode704 {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;

        int search = search(nums, target);
        System.out.println(search);

    }


    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] < target) {
                left = middle+1;
            } else {
                right = middle-1;
            }
        }
        return -1;
    }


}


