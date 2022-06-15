package com.away.binarysearch;

import java.util.Arrays;

/**
 * @author away
 * @date 2022-06-15 17:11
 */
public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = 1000000000+1;
        while (min < max) {
            int mid = (max-min)/2+min;
            if (canFinish(piles, h, mid)) {
                max = mid;
            }else {
                min = mid+1;
            }
        }
        return min;

    }

    public static boolean canFinish(int[] piles, int h, int k) {
        int min = 0;
        for (int pile : piles) {
            if (pile % k == 0) {
                min+=pile/k;
            }else {
                min+=pile/k+1;
            }
        }
        return h>=min;
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        minEatingSpeed(piles, 8);
    }
}
