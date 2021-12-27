package com.civism.leetcode;

public class Leetcode557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String s1 = reverseWords(s);
        System.out.println(s1);
    }

    public static String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String ss : s1) {
            result.append(revert(ss.toCharArray()));
            result.append(" ");
        }
        String s2 = result.toString();
        return s2.substring(0,s2.length()-1);
    }

    public static String revert(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char t = s[j];
            s[j--] = s[i];
            s[i++] = t;
        }
        return new String(s);
    }


}
