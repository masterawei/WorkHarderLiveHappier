package com.away.dynamicprogramming;

import javax.swing.tree.TreeNode;

/**
 * @author away
 * @date 2021-12-16 10:04
 */
public class HouseRobberIii {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(){}

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public int rob(TreeNode root) {
        int[] res = robAction(root);
        return Math.max(res[0], res[1]);
    }

    int[] robAction(TreeNode root) {
        if (root == null) {
            return new int[2];
        }
        int[] res = new int[2];

        int[] left = robAction(root.left);
        int[] right = robAction(root.right);

        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        res[1] = left[0] +right[0] + root.val;
        return res;
    }
}
