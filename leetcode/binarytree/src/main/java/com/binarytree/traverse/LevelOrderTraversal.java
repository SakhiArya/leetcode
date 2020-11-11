package com.binarytree.traverse;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		
		List<List<Integer>> levelOrder = new ArrayList<>();
		List<Integer> listSet = new ArrayList<>();
		if(root == null) {
			return levelOrder;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode queueHead = queue.poll();
			if(queueHead !=null && queue.peek()!=null) {
				levelOrder.add(listSet);
				listSet = new ArrayList<>();
				queue.offer(null);
			}else if(queueHead == null && queue.peek() == null) {
				levelOrder.add(listSet);
				return levelOrder;
			}else {
				listSet.add(queueHead.val);
				if(queueHead.left!= null) {
					queue.offer(queueHead.left);
				}
				if(queueHead.right!=null) {
					queue.offer(queueHead.right);
				}
			}
		}
		
		return levelOrder;
	}

}
