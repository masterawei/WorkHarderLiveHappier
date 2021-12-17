package com.away.DFS;

import com.away.predefineddatastructure.TreeNode;

/**
 * @author away
 * @date 2021-12-17 14:49
 */
public class DiameterOfBinaryTree {
    int max =0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        dfs(root);
        return max;
    }

    int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        max = Math.max(max, left + right);

        return Math.max(left,right)+1;
    }
}
