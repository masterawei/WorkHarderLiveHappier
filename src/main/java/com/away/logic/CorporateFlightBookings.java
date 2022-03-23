package com.away.logic;

/**
 * @author away
 * @date 2022-03-23 22:25
 */
public class CorporateFlightBookings {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diffNums = new int[n];
        for (int[] booking : bookings) {
            add(diffNums, booking[0], booking[1], booking[2]);
        }
        for (int i = 1; i < diffNums.length; i++) {
            diffNums[i] = diffNums[i] + diffNums[i - 1];
        }
        return diffNums;
    }

    public void add(int[] diffNums, int i, int j, int num) {
        diffNums[i]+=num;
        if (j + 1 < diffNums.length) {
            diffNums[j+1]-=num;
        }
    }
}
