package com.away.binarytree;

import com.away.predefineddatastructure.TreeNode;

/**
 * @author away
 * @date 2022-07-05 9:21
 */
public class BinaryTreeMaximumPathSum {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        maxPath(root);
        return max;
    }

    private int maxPath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = Math.max(0,maxPath(root.left);
        int rightMax = Math.max(0, maxPath(root.right));
        max = Math.max(root.val+leftMax+rightMax,max);
        return Math.max(leftMax,rightMax)+root.val;
    }
}
