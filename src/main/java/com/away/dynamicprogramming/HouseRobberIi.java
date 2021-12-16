package com.away.dynamicprogramming;

/**
 * @author away
 * @date 2021-12-16 9:44
 */
public class HouseRobberIi {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int firstHose = nums[0];
        int secondHouse = Math.max(nums[0], nums[1]);
        int max1 = Math.max(firstHose, secondHouse);
        for (int i = 2; i < nums.length - 1; i++) {
            max1 = Math.max(firstHose+nums[i],secondHouse);
            firstHose = secondHouse;
            secondHouse = max1;
        }
        firstHose = nums[1];
        secondHouse = Math.max(nums[1], nums[2]);
        int max = Math.max(firstHose, secondHouse);
        for (int i = 3; i < nums.length ; i++) {
            max = Math.max(firstHose + nums[i], secondHouse);
            firstHose = secondHouse;
            secondHouse = max;
        }

        return Math.max(max, max1);
    }
}
