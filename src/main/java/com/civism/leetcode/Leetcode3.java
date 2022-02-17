package com.civism.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode3 {
    public static void main(String[] args) {
        String s = "pwwkew";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    public static int lengthOfLongestSubstring(String s) {
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<Character>();
            for (int j = i; j < s.length(); j++) {
                if (set.add(s.charAt(j))) {
                    if (len < set.size()) {
                        len = set.size();
                    }
                } else {
                    if (len < set.size()) {
                        len = set.size();
                    }
                    break;
                }
            }
        }
        return len;
    }
}
