package com.away.dynamicprogramming;

/**
 * @author away
 * @date 2021-12-17 9:35
 * 使用贪心算法的做法,优化了空间, 还可以使用贪心做
 */
public class BestTimeToBuyAndSellStockIi {
    public int maxProfit(int[] prices) {
        int hold = - prices[0];
        int sell = 0;
        for (int i = 1; i < prices.length; i++) {
            sell = Math.max(sell, hold + prices[i]);
            hold = Math.max(hold, sell - prices[i]);
        }
        return sell;
    }
}
