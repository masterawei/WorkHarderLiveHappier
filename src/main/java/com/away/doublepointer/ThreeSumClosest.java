package com.away.doublepointer;

import java.util.Arrays;

/**
 * @author away
 * @date 2022-07-07 14:24
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int res = Integer.MAX_VALUE;
        int gap = Integer.MAX_VALUE;
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i+1;
            int right = len-1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > target) {
                    right--;
                }else if (sum<target){
                    left++;
                }else {
                    return 0;
                }
                if (Math.abs(target - sum) < gap) {
                    gap = Math.abs((target - sum));
                    res = sum;
                }

            }
        }
        return res;
    }
}
