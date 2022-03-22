package com.away.logic;

import java.util.HashMap;

/**
 * @author away
 * @date 2022-03-22 21:49
 */
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int cnt = 0;
        int sum0_i = 0;
        for (int i = 0; i < nums.length; i++) {
            sum0_i+=nums[i];
            int sum0_j = sum0_i-k;
            if (map.containsKey(sum0_j)) {
                cnt+=map.get(sum0_j);
            }
            map.put(sum0_i, map.getOrDefault(sum0_i, 0) + 1);
        }
        return cnt;
    }
}
