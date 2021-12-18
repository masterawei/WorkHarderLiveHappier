package com.away.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author away
 * @date 2021-12-18 15:17
 */
public class LongestIncreasingSubsequenceTest {

    @Test
    public void lengthOfLIS() {
        int[] nums = {1,3,6,7,9,4,10,5,6};
        LongestIncreasingSubsequence.lengthOfLIS(nums);
    }
}