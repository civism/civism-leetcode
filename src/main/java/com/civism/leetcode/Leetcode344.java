package com.civism.leetcode;

import java.util.Arrays;

public class Leetcode344 {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char t = s[j];
            s[j--] = s[i];
            s[i++] = t;
        }

    }
}
