package com.away.logic;

import java.util.*;

/**
 * @author away
 * @date 2022-07-10 21:15
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] cs = str.toCharArray();
            Arrays.sort(cs);
            String standard = new String(cs);
            if (map.containsKey(standard)) {
                map.get(standard).add(str);
            }else {
                map.put(standard,Arrays.asList(str));
            }
        }
        return new ArrayList<>(map.values()) ;
    }
}
