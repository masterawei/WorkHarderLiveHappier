package com.away.dynamicprogramming;

import java.util.Arrays;
import java.util.List;

/**
 * @author away
 * @date 2021-12-17 7:30
 */
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (wordDict.contains(s.substring(j,i)) && dp[j]) {
                    dp[i] = true;
                }
            }
        }
        System.out.println(Arrays.toString(dp));

        return dp[s.length()];
    }
}
