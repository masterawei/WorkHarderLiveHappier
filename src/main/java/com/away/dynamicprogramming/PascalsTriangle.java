package com.away.dynamicprogramming;

import java.util.LinkedList;
import java.util.List;

/**
 * @author away
 * @date 2021-12-13 17:18
 */
public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> last = null;
            if (i != 0) {
                 last= res.get(res.size() - 1);
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                }else {
                    list.add(last.get(j - 1) + last.get(j));
                }

            }
            res.add(new LinkedList<>(list));
        }
        return res;
    }
}
