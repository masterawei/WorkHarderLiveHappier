package com.away.dynamicprogramming;

/**
 * @author away
 * @date 2021-12-14 9:05
 */
public class OnesAndZeroes {
        public int findMaxForm(String[] strs, int m, int n) {
            int len = strs.length;
            int[][][] dp = new int[len + 1][m + 1][n + 1];
            for (int i = 1; i <= len; i++) {
                int[] count = countZeroAndOne(strs[i - 1]);
                for (int j = 0; j <= m; j++) {
                    for (int k = 0; k <= n; k++) {
                        // 先把上一行抄下来
                        dp[i][j][k] = dp[i - 1][j][k];
                        int zeros = count[0];
                        int ones = count[1];
                        if (j >= zeros && k >= ones) {
                            dp[i][j][k] = Math.max(dp[i - 1][j][k], dp[i - 1][j - zeros][k - ones] + 1);
                        }
                    }
                }
            }
            return dp[len][m][n];
        }

        /**
         * 这个计算的思路很牛
         * @param str 需要计算的字符串
         * @return 数组索引为i的值即数字i的数量
         */

        private int[] countZeroAndOne(String str) {
            int[] cnt = new int[2];
            for (char c : str.toCharArray()) {
                cnt[c - '0']++;
            }
            return cnt;
        }
}
