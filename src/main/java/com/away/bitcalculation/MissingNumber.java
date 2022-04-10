package com.away.bitcalculation;

/**
 * @author away
 * @date 2022-04-10 22:30
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
    int res = 0;
    for(int i =0;i<nums.length+1;i++){
        if(i!=nums.length){
            res = res^nums[i];
        }
        res = res^i;
    }
    return res;
}
}
