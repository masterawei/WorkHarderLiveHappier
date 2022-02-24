package com.away.doublepointer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author away
 * @date 2022-02-24 13:23
 */
public class IntervalListIntersections {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> list = new ArrayList<>();
        int i =0,j=0;
        while (i < firstList.length && j < secondList.length) {
            int a1 = firstList[i][0],a2=firstList[i][1];
            int b1 = secondList[j][0],b2=secondList[j][1];

            if (a2 >= b1 && b2 >= a1) {
                list.add(new int[]{
                        Math.max(a1,b1),Math.min(a2,b2)
                });
            }

            if (b2 > a2) {
                i++;
            } else {
                j++;
            }
        }
        return list.toArray(new int[0][0]);
    }
}
