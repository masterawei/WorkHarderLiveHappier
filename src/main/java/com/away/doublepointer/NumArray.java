package com.away.doublepointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author away
 * @date 2022-03-17 21:01
 */
public class NumArray {
   int[] arrs;

    public NumArray(int[] nums){

        arrs = nums;
        arrs[0] =nums[0];
        for (int i = 1; i < nums.length; i++) {
            arrs[i] = arrs[i-1]+nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return arrs[right];
        }else {
            return arrs[right]-arrs[left]+(arrs[left]-arrs[left-1]);
        }
    }
}
