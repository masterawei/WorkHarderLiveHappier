package com.away.binarysearch;

/**
 * @author away
 * @date 2022-06-15 17:45
 */
public class CapacityToShipPackagesWithinDDays {
    public static int shipWithinDays(int[] weights, int days) {
        int lo = 1;
        int hi = 500+1;
        while (lo < hi) {
            int mid = (lo+hi)/2;
            if (canPack(weights, days, mid)) {
                hi = mid;
            }else {
                lo = mid+1;
            }
        }
        return lo;
    }

    public static boolean canPack(int[] weights, int days, int capacity) {
        int minDays = 1;
        int cap = capacity;
        for (int weight : weights) {
            if (weight > capacity) {
                return false;
            }
            if (cap - weight > 0) {
                cap-=weight;
            }else {
                cap =capacity-weight;
                minDays++;
            }
        }
        return days>=minDays;
    }

    public static void main(String[] args) {
        int[] weight = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        canPack(weight,5,6);
    }
}
