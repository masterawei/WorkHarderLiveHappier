package com.away.logic;

/**
 * @author away
 * @date 2021-12-17 15:40
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int res = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == res) {
                count++;
            }else {
                count--;
                if (count < 0) {
                    res = nums[i];
                    count=1;
                }
            }
        }
        return res;
    }
}
