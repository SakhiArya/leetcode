package com.binarytree.traverse;

import java.util.Stack;

public class PostorderIterator {
	
	private Stack<TreeNode> stack1;
	private Stack<TreeNode> stack2;
	
	public PostorderIterator(TreeNode node) {
		this.stack1 = new Stack<>();
		this.stack2 = new Stack<>();
		stack1.push(node);
		visitleftright();

	}
	
    private void visitleftright() {
    	while(!stack1.isEmpty()) {
    		TreeNode topElement = stack1.pop();
    		stack2.push(topElement);
    		if(topElement.left!=null) {
    			stack1.push(topElement.left);
    		}
    		if(topElement.right!= null) {
    			stack1.push(topElement.right);
    		}
    	}		
	}

	/** @return the next smallest number */
    public int next() {

        return stack2.pop().val;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack2.isEmpty();
        
    }

}
