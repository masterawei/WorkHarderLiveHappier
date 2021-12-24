package com.away.hashmap;

import java.util.HashMap;

/**
 * @author away
 * @date 2021-12-24 14:33
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }
            map.put(num,1);
        }
        return false;
    }
}
