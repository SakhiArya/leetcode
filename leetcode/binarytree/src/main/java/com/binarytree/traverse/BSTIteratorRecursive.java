package com.binarytree.traverse;

import java.util.ArrayList;
import java.util.List;

public class BSTIteratorRecursive {
	
	List<TreeNode> array; 
	int index;
	
	 public BSTIteratorRecursive(TreeNode root) {
		 array = new ArrayList<>();
		 index = -1;
		 inorderTraversal(root);
	 }
	 public void inorderTraversal(TreeNode root){
		 if(root == null) {
			 return ;
		 }
		 inorderTraversal(root.left);
		 array.add(root);
		 inorderTraversal(root.right);
	 }
	 
	    public int next() {
	    	return array.get(++this.index).val;
	    }
	    
	    public boolean hasNext() {
	    	if(this.index +1 < this.array.size()) {
	    		return true;
	    	}return false;
	    }

}
