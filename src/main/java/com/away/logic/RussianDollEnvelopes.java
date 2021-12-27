package com.away.logic;

import java.util.Arrays;

/**
 * @author away
 * @date 2021-12-27 20:00
 */
public class RussianDollEnvelopes {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes,(o1,o2)-> o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0]);
        int[] envelope = new int[envelopes.length];
        for (int i = 0; i < envelopes.length; i++) {
            envelope[i] = envelopes[i][1];
        }
        int[] dp = new int[envelope.length];
        Arrays.fill(dp, 1);
        int max = 1;
        for (int i = 1; i < envelope.length; i++) {
            if (envelope[i] > envelope[i - 1] && dp[i - 1] == max) {
                dp[i] = dp[i-1]+1;
            }else {

                for (int j = i - 1; j >= 0; j--) {
                    if (envelope[i] > envelope[j]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
