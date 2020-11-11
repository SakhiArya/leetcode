package com.binarytree.traverse;

import java.util.Stack;

public class PreorderIterator {
	
	Stack<TreeNode> stack;
	
	public PreorderIterator(TreeNode root) {
		this.stack = new Stack<>();
		stack.push(root);
	}
	
	void visitLeftRight(TreeNode treeNode){
		if(treeNode!= null && treeNode.right != null) {
			this.stack.push(treeNode.right);
		}	
		if(treeNode != null && treeNode.left != null) {
			this.stack.push(treeNode.left);
		}
	}
	
    /** @return the next smallest number */
    public int next() {
        TreeNode stackHead = this.stack.pop();
        visitLeftRight(stackHead);
        return stackHead.val;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
        
    }

}
