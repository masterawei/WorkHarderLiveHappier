package com.away.binarytree;

import com.away.predefineddatastructure.TreeNode;

import java.util.*;

/**
 * @author away
 * @date 2021-12-24 13:39
 */
public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new LinkedList<>();
        }
       Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        queue.offer(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            LinkedList<Integer> list = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode tmp = queue.poll();
                if (flag) {
                    list.addLast(tmp.val);
                }else {
                    list.addFirst(tmp.val);
                }

                if (tmp.left != null) {
                    queue.offer(tmp.left);
                }
                if (tmp.right != null) {
                    queue.offer(tmp.right);
                }
            }
            flag=!flag;
            res.add(list);
        }
        return res;
    }
}
