package com.away.binarytree;

import com.away.predefineddatastructure.TreeNode;

/**
 * @author away
 * @date 2022-07-06 10:01
 */
public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
       return sum(root,0);
    }
    public int sum(TreeNode root,int curSum){
        if (root == null) {
            return 0;
        }
        int tmp = curSum*10+root.val;
        if (root.left == null && root.right == null) {
            return tmp;
        }
        int left = sum(root.left, tmp);
        int right = sum(root.right,tmp);
        return left + right;
    }
}
