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
        for (int i = 0; i < numRows; i++) {
            //和回溯不一样,list的值不会自动重置消失,所以每次都需要重新初始化list
            LinkedList<Integer> list = new LinkedList<>();
            //如果把last定义在if里面,if外面的地方就访问不到last的值了,作用域消失了
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
