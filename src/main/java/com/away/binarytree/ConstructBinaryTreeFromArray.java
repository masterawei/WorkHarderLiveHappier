package com.away.binarytree;

import com.away.predefineddatastructure.TreeNode;
import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @author away
 * @date 2022-05-30 14:38
 */
public class ConstructBinaryTreeFromArray {
    public static TreeNode construct(String[] arr){
       return constructBinaryTree(arr,0);
    }

    private static TreeNode constructBinaryTree(String[] arr, int index) {
        if (index >= arr.length||arr[index]==null) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(arr[index]));
        root.left = constructBinaryTree(arr,2*index+1);
        root.right = constructBinaryTree(arr,2*index+2);
        return root;

    }
}
