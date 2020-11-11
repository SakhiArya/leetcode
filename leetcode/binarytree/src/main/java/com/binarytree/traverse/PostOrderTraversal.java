package com.binarytree.traverse;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {
	
	 public List<Integer> postorderTraversal(TreeNode root) {
		 List<Integer> postOrder = new ArrayList<>();
		 
		 if(root == null) {
			 return postOrder;
		 }
		 
		 Stack<TreeNode> stack = new Stack<>();
		 while(!stack.isEmpty() || root != null) {
			 while(root!=null) {
				 if(root.right!=null) {
					 stack.push(root.right);
				 }
				 stack.push(root);
				 root = root.left;
			 }
			 root = stack.pop();
			 if(!stack.isEmpty() && root.right == stack.peek()) {
				 stack.pop();
				 stack.push(root);
			 }else {
				 postOrder.add(root.val);
				 root = null;
			 }
		 }
		 return postOrder;
	 }
	 public List<Integer> postorderTraversalusing2Stacks(TreeNode root) {
		 List<Integer> postOrder = new ArrayList<>();
		 if(root == null) {
			 return postOrder;
		 }
		 Stack<TreeNode> stack1 = new Stack<>(),stack2 = new Stack<>();
		 TreeNode treeNode;
		 stack1.push(root);
		 
		 while(!stack1.isEmpty()) {
			 treeNode = stack1.pop();
			 stack2.push(treeNode);
			 if(treeNode.left!=null) {
				 stack1.push(treeNode.left);
			 }
			 if(treeNode.right!=null) {
				 stack1.push(treeNode.right);
			 }
		 }
		 while(!stack1.isEmpty()) {
			 postOrder.add(stack1.pop().val);
		 }
		 
		 return postOrder;
	 }

}
