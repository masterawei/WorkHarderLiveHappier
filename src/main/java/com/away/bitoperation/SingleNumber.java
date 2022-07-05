package com.away.bitoperation;

/**
 * @author away
 * @date 2021-12-18 20:54
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res = res^num;
        }
        return res;
    }

}
