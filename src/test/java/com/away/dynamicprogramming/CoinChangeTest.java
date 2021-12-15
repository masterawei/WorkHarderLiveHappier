package com.away.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author away
 * @date 2021-12-15 10:28
 */
public class CoinChangeTest {

    @Test
    public void coinChange() {
        int[] coins = {2};
        CoinChange.coinChange(coins,3);
    }
}