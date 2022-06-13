package com.away.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author away
 * @date 2022-06-13 11:23
 */
public class RansomNote {
    /**
     *
     Hashmap很好,但是不够好
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c).equals(0)) {
                    map.remove(c);
                }
            }else {
                return false;
            }
        }
        return true;

    }
    public boolean canConstruct2(String ransomNote, String magazine) {
        int[] map = new int[26];
        for (char c : magazine.toCharArray()) {
            map[c-'a'] +=1;
        }
        for (char c : ransomNote.toCharArray()) {
            if (map[c - 'a'] > 0) {
                map[c-'a']-=1;
            }else {
                return false;
            }
        }
        return true;
    }
}
