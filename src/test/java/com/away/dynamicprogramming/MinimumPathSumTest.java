package com.away.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author away
 * @date 2021-12-13 12:30
 */
public class MinimumPathSumTest {

    @Test
    public void minPathSum() {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(MinimumPathSum.minPathSum(grid));
    }
}