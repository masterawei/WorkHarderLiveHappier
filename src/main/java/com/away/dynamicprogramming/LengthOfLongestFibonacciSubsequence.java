package com.away.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

/**
 * @author away
 * @date 2022-07-10 0:01
 */
public class LengthOfLongestFibonacciSubsequence {
    public int lenLongestFibSubseq(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int[][] dp = new int[arr.length-1][arr.length];
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int gap = arr[j]-arr[i];
                if (map.containsKey(gap) && map.get(gap) < i) {
                    int k = map.get(gap);
                    dp[i][j] = dp[k][i]+1;
                    maxLen = Math.max(maxLen, dp[i][j]+2);
                }
            }
        }
        return maxLen;
    }
}
