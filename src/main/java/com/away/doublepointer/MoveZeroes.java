package com.away.doublepointer;

/**
 * @author away
 * @date 2022-01-27 13:44
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
       int slow = 0;
       int fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                int tmp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = tmp;
                slow++;
            }
            fast++;
        }
    }
}
