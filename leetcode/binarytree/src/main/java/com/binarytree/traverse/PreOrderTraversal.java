package com.binarytree.traverse;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {

	public List<Integer> preorderTraversal(TreeNode root) {
		
		List<Integer> preOrderResult = new ArrayList<>();
		
		if(root ==null) {
			return preOrderResult;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.add(root);
		
		while(!stack.isEmpty()) {
			TreeNode topElement = stack.pop();
			preOrderResult.add(topElement.val);
			if(topElement.right!= null) {
				stack.push(topElement.right);
			}
			if(topElement.left != null) {
				stack.push(topElement.left);
			}
		}
		return preOrderResult;
	}
}
