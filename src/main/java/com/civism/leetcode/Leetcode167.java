package com.civism.leetcode;

import java.util.Arrays;

public class Leetcode167 {
    public static void main(String[] args) {
        int[] nums = {-1,0};
        int[] ints = twoSum(nums, -1);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length - 1; i++) {
            int temp = target - numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == temp) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    return result;
                }
            }

        }
        return result;
    }
}
