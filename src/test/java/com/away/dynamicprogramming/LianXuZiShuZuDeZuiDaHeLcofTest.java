package com.away.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author away
 * @date 2021-12-14 15:23
 */
public class LianXuZiShuZuDeZuiDaHeLcofTest {

    @Test
    public void maxSubArray() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(LianXuZiShuZuDeZuiDaHeLcof.maxSubArray(nums));
    }
}