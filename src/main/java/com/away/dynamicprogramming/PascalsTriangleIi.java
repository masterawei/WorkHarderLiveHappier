package com.away.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

/**
 * @author away
 * @date 2021-12-13 17:38
 */
public class PascalsTriangleIi {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int i = 1; i <= rowIndex; ++i) {
                row.add(0);
                for (int j = i; j > 0; --j) {
                    row.set(j, row.get(j) + row.get(j - 1));
                }
            }
            return row;
        }
}
