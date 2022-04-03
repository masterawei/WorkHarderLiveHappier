package com.away.logic;

/**
 * @author away
 * @date 2022-04-01 23:27
 * 需要牢牢抓住need的定义:需要右括号的数量
 */
public class MinimumInsertionsToBalanceAParenthesesString {
    public int minInsertions(String s) {
        int res = 0;
        int need= 0;
        for (char c : s.toCharArray()) {
            if ('(' == c) {
                if ((need & 1) == 1) {
                    res++;
                }
                need+=2;
            }
            else {
                need--;
                if (need == -1) {
                    res++;
                    need=1;
                }
            }

        }
        return res+need;
    }
}
