package com.away.logic;

/**
 * @author away
 * @date 2022-07-08 14:48
 */
public class MinimumCostToMoveChipsToTheSamePosition {
    public int minCostToMoveChips(int[] position) {
        int len = position.length;
        int a = 0;
        for (int p : position) {
            //统计的是奇数的个数
            a+=p%2;
        }
        return Math.min(a, len - a);

    }
}
