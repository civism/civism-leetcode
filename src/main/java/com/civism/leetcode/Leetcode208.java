package com.civism.leetcode;

public class Leetcode208 {
    int bad = 4;

    public static void main(String[] args) {
        int i = firstBadVersion(5);
        System.out.println(i);
    }

    public static int firstBadVersion(int n) {
        int left = 0, right = n;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (isBadVersion(middle)) {
                if (!isBadVersion(middle - 1)) {
                    return middle;
                } else {
                    right = middle - 1;
                }
            } else {
                if (isBadVersion(middle + 1)) {
                    return middle + 1;
                } else {
                    left = middle + 1;
                }
            }
        }
        return 1;
    }

    private static boolean isBadVersion(int i) {
        return i == 4;
    }


}
