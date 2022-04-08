package com.away.bitcalculation;

/**
 * @author away
 * @date 2022-04-08 22:27
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int res = 0;
        while(n!=0){
            n = n&(n-1);
            res++;
        }
        return res;
    }
}
