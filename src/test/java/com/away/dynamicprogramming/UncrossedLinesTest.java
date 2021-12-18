package com.away.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author away
 * @date 2021-12-18 16:29
 */
public class UncrossedLinesTest {

    @Test
    public void maxUncrossedLines() {
        int[] nums1 = {1,4,2};
        int[] nums2 = {1, 2, 4};
        UncrossedLines.maxUncrossedLines(nums1,nums2);
    }
}