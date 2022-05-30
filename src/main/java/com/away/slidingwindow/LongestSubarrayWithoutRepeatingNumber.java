package com.away.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * @author away
 * @date 2022-05-30 10:40
 */
public class LongestSubarrayWithoutRepeatingNumber {
    public int lengthOfArray(int[] nums){
        Map<Integer,Integer> window = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = 1;
        while(right<nums.length){
            int c = nums[right++];
            window.put(c,window.getOrDefault(c,0)+1);
            while(window.get(c)>1){
                int d = nums[left++];
                window.put(d,window.get(d)-1);
            }
            max = Math.max(max,right-left);
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
