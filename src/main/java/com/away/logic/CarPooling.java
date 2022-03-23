package com.away.logic;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author away
 * @date 2022-03-23 22:47
 */
public class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        int maxDistance = 0;
        for (int[] trip : trips) {
            maxDistance = Math.max(maxDistance, trip[2]);
        }
        int[] diffNums = new int[maxDistance];
        for (int i = 0; i < trips.length; i++) {
            add(diffNums, trips[i][1], trips[i][2] - 1, trips[i][0]);
        }
        for (int i = 1; i < maxDistance; i++) {
            diffNums[i] = diffNums[i - 1] + diffNums[i];
        }
        return isCapable(diffNums, capacity);
    }

    public boolean isCapable(int[] nums,int capacity) {
        return Arrays.stream(nums).boxed().noneMatch((num)->num>capacity);
    }

    public void add(int[] nums, int i, int j, int num) {
        nums[i]+=num;
        if (j + 1 < nums.length) {
            nums[j + 1] -= num;
        }
    }
}
