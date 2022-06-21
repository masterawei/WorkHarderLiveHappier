package com.away.doublepointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author away
 * @date 2022-06-21 10:15
 */
public class NSum {
    public List<List<Integer>> nSum(int[] nums, int n, int start, int target) {
        int size = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (n < 2 || n > size) {
            return res;
        }

        if (n==2){
            int left = start;
            int right = size-1;
            while (left < right) {
                int leftElem = nums[left];
                int rightElem = nums[right];
                int sum = leftElem + rightElem;
                if (sum < target) {
                    //左指针右移+去重
                    while (left < right && nums[left] == leftElem) {
                        left++;
                    }
                } else if (sum > target) {
                    //右指针左移+去重
                    while (left < right && nums[right] == rightElem) {
                        right--;
                    }
                } else {
                    //加入一组元素
                    res.add(Arrays.asList(leftElem, rightElem));
                    //去重
                    while (left < right && nums[left] == leftElem) {
                        left++;
                    }
                    while (left < right && nums[right] == rightElem) {
                        right--;
                    }
                }
            }
        }else {
            //大于2个数之和，采用递归计算
            for (int i = start; i < size; i++) {
                List<List<Integer>>  subResult= nSum(nums, n - 1, i + 1,
                        target - nums[i]);
                //加入当前元素
                for (List<Integer> list : subResult) {
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    arrayList.add(nums[i]);
                    arrayList.addAll(list);
                    res.add(arrayList);
                }
                //去重
                while (i < size - 1 && nums[i + 1] == nums[i]) {
                    i++;
                }
            }
        }
        return res;
    }
}
