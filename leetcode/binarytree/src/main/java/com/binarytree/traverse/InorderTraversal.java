package com.binarytree.traverse;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
	
	public List<Integer> inorderTraversal(TreeNode root) {
		
		List<Integer> inoredrTraversal = new ArrayList<>();
		if(root == null) {
			return inoredrTraversal;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode currNode = root;
		
		while(currNode!=null || !stack.isEmpty()) {
			while(currNode!=null) {
				stack.push(currNode);
				currNode = currNode.left;
			}
			currNode = stack.pop();
			inoredrTraversal.add(currNode.val);
			currNode = currNode.right;
		}
		
		return inoredrTraversal;
	}

}
