package com.away.dynamicprogramming;

/**
 * @author away
 * @date 2022-01-27 14:33
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int sum =0;
        for (int i = 1; i < height.length - 1; i++) {
            left[i] = Math.max(left[i - 1], height[i - 1]);
        }
        for (int i = height.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i + 1]);
        }

        for (int i = 1; i < height.length - 1; i++) {
            int min = Math.min(left[i], right[i]);
            if (min > height[i]) {
                sum += min - height[i];
            }
        }
        return sum;
    }
}
