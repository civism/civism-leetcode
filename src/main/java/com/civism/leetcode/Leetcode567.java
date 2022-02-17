package com.civism.leetcode;

public class Leetcode567 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "ooolleoooleh";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        char c = s1.charAt(0);
        int index = s2.indexOf(c)+1;
        String substring = s2.substring(Math.max(index - l1, 0), Math.min(index + l1, l2));
        for (int i = 1; i < l1; i++) {
            if (substring.indexOf(s1.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}
