package com.away.doublepointer;

import javax.swing.*;

/**
 * @author away
 * @date 2022-01-26 12:26
 */
public class RemoveElement {
    /**
     * 快慢指针
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int slow = nums.length-1;
        int fast = nums.length-1;
        while (fast >= 0) {
            if (nums[fast] == val) {
                int tmp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = tmp;
                slow--;
            }
            fast--;
        }
        return slow+1;
    }


}
