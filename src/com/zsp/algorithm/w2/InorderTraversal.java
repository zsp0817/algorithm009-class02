package com.zsp.algorithm.w2;

import com.zsp.algorithm.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by zhangshaopeng on 2020/5/31.
 * <p>
 * 二叉树的中序遍历
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal
 */
public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        // 方法一：递归
//        List<Integer> res = new ArrayList<>();
//        helper(root, res);
//        return res;

        // 方法二：使用栈来缓存
        // 还是不太懂，具体看题解：https://leetcode-cn.com/problems/binary-tree-inorder-traversal/solution/er-cha-shu-de-zhong-xu-bian-li-by-leetcode/
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }

    private void helper(TreeNode node, List<Integer> res) {
        if (node != null) {
            if (node.left != null) helper(node.left, res);
            res.add(node.val);
            if (node.right != null) helper(node.right, res);
        }
    }
}