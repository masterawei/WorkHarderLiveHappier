package com.away.doublepointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author away
 * @date 2022-02-25 22:46
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[j - 1]) {
                    continue;
                }
                int left = j+1,right = nums.length-1;
                while (left<right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    }else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return res;
    }
    public static List<List<Integer>> fourSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length-3;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }

            for(int j = i+1;j<nums.length-2;j++){
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                int left = j+1,right = nums.length-1;
                while(left<right){
                    int sum = nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum>target){
                        right--;
                    }else if(sum<target){
                        left++;
                    }else{
                        res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while(right>left&&nums[left]==nums[left+1]){
                            left++;
                        }
                        while(right>left&&nums[right]==nums[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }

                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        fourSum2(nums,0);
    }
}
