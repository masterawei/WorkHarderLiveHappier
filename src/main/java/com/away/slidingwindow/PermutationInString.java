package com.away.slidingwindow;

import java.util.HashMap;

/**
 * @author away
 * @date 2022-01-24 20:25
 */
public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> need  = new HashMap<>();
        for (char c : s1.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int left =0;
        int right =0;
        int valid =0;
        HashMap<Character,Integer> window = new HashMap<>();
        while (right < s2.length()) {
            char c = s2.charAt(right);
            right++;
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (window.get(c).equals(need.get(c))) {
                valid++;
            }
            while (right - left >= s1.length()) {
                if (valid == need.size()) {
                    return true;
                }
                char d = s2.charAt(left);
                left++;
                if (window.get(d).equals(need.get(d))) {
                    valid--;
                }
                window.put(d, window.get(d) - 1);
            }
        }
        return false;
    }
}
