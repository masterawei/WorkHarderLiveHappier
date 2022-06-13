package com.away.binarysearch;

/**
 * @author away
 * @date 2022-06-13 14:57
 */
public class PreimageSizeOfFactorialZeroesFunction {
    public int preimageSizeFZF(int k) {
        return (int) (rightBorder(k) - leftBorder(k) );
    }
    public long trailingZeroes(long n){
        long res =0;
        for (long i = n; i/5 > 0; i/= 5) {
            res+= i/5;
        }
        return res;
    }

    public long leftBorder(int k) {
        long left = 0;
        long right = Long.MAX_VALUE;
        while (left <= right) {
            long mid = (right-left)/2+left;
            long val = trailingZeroes(mid);
            if (k == val) {
                right = mid-1;
            } else if (k > val) {
                left =mid+1;
            }else {
                right = mid-1;
            }
        }
        return right;
    }

    public long rightBorder(int k) {
        long left = 0;
        long right = Long.MAX_VALUE;
        while (left <= right) {
            long mid = (right-left)/2+left;
            long val = trailingZeroes(mid);
            if (k == val) {
                left = mid+1;
            } else if (k < val) {
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return right;
    }


}
