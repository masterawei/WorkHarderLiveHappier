package com.away.doublepointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author away
 * @date 2022-02-25 22:16
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left =i+1,right = nums.length-1;
            while (left < right) {
                int sum = nums[i]+nums[left]+nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                }else {
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right++;
                    }
                    left++;
                    right--;
                }

            }
        }
        return res;
    }


    public static List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]>0){
                break;
            }
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum>0){
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    res.add(Arrays.stream(new int[]{nums[i],nums[left],nums[right]}).boxed().collect(Collectors.toList()));
                    while(right>left){
                        if(nums[right]==nums[right-1]){
                            right--;
                        }
                    }
                    right--;
                    while (right>left&&nums[left]==nums[left+1]){
                        left++;
                    }
                    left++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        threeSum2(nums);
    }
}
