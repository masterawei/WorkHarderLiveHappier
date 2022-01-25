package com.away.doublepointer.fastandslowpointer;

/**
 * @author away
 * @date 2021-12-26 19:52
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int slow = 0;
        int fast = 1;
        while (fast < nums.length) {
            if (nums[slow] != nums[fast]) {
                nums[++slow] = nums[fast];
            }
            fast++;
        }
        return slow+1;
    }

    public int removeDuplicatesRevise(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int slow = 0;
        int fast = 1;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                nums[++slow] = nums[fast];
            }
            fast++;
        }
        return slow+1;
    }
}
