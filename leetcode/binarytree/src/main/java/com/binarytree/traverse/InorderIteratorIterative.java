package com.binarytree.traverse;

import java.util.Stack;

class InorderIteratorIterative {

    Stack<TreeNode> stack; 
    public InorderIteratorIterative(TreeNode root) {
        stack = new Stack<>();
        this.inorderTraversal(root);
        
    }
    
    public void inorderTraversal(TreeNode root){
        while(root!=null){
            this.stack.push(root);
            root = root.left;
        }
    }
    
    /** @return the next smallest number */
    public int next() {
        TreeNode stackHead = this.stack.pop();
        if(stackHead.right!= null){
            this.inorderTraversal(stackHead.right);
        }
        return stackHead.val;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
        
    }
}