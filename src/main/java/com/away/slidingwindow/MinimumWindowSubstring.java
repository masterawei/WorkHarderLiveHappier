package com.away.slidingwindow;

import java.util.HashMap;

/**
 * @author away
 * @date 2022-01-24 20:27
 */
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        int right = 0;
        int start = 0;
        int end = 0;
        int len = Integer.MAX_VALUE;
        int valid = 0;
        HashMap<Character,Integer> window = new HashMap<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            window.put(c,window.getOrDefault(c,0)+1);
            //下面的比较需要使用equals,因为是integer
            if (window.get(c).equals(need.get(c))) {
                valid++;
            }
            while (valid == need.size()) {
                if (right - left < len) {
                    len = right-left;
                    start = left;
                }
                char d = s.charAt(left);
                left++;
                if (need.get(d).equals(window.get(d))) {
                    valid--;

                }
                window.put(d, window.get(d) - 1);
            }

        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start,start+ len);
    }
}
