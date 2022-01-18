package com.away.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * @author away
 * @date 2022-01-18 14:15
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> window = new HashMap<>(32);
        int left=0, right=0;
        int max = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            window.put(c, window.getOrDefault(c, 0) + 1);
            while (window.get(c) > 1) {
                char d = s.charAt(left);
                left++;
                window.put(d, window.get(d) - 1);
            }
            max = Math.max(max,right-left);
        }
        return max;
    }
}
