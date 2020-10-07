package com.binarysearch.template.analysis;

public class ClosestBinarySearchTreeValue {
	
	 public int closestValue(TreeNode root, double target) {
		 long targetRound = Math.round(target),closest = root.val, 
				 minDiff =  (long) Math.abs(root.val - target);
		 
		 while(root != null) {
			 if(Math.abs(root.val - targetRound) <= minDiff) {
				 closest = root.val;
				 minDiff = (long) Math.abs(root.val - targetRound);
			 }
			 if(root.val > targetRound) {
				 root = root.left;
			 }else {
				 root = root.right;
			 }
		 }
		 return (int)closest;
		 
	 }

}
