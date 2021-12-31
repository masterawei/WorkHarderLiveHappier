package com.away.math;

/**
 * @author away
 * @date 2021-12-31 23:06
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int res = 0;
        long divisor = 5;
        while (divisor <= n) {
            res+=n/divisor;
            divisor*=5;
        }
        return res;
    }
}
