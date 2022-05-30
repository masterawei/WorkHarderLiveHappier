package com.away.binarytree;

import com.away.predefineddatastructure.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author away
 * @date 2022-05-30 15:05
 */
public class BinaryTreeLevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null){
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        List<List<Integer>> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int sz = queue.size();
            for (int i = 0; i < sz; i++) {
                TreeNode tmp = queue.poll();
                list.add(tmp.val);
                if (tmp.left != null) {
                    queue.offer(tmp.left);
                }
                if (tmp.right != null) {
                    queue.offer(tmp.right);
                }
            }
            res.add(list);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = ConstructBinaryTreeFromArray.construct(new String[]{"1", "2", "3", "4"});
        List<List<Integer>> lists = levelOrder(root);
        lists.forEach(System.out::println);
    }
}
