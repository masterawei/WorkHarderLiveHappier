package com.away.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author away
 * @date 2022-05-25 14:43
 */
public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for (Integer integer : map.keySet()) {
            if (set.contains(map.get(integer))) {
                return false;
            }
            set.add(map.get(integer));
        }
        return true;
    }
}
