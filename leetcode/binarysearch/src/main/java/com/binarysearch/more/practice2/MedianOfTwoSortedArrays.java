package com.binarysearch.more.practice2;

public class MedianOfTwoSortedArrays {
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if(nums1.length > nums2.length){
			return findMedianSortedArrays(nums2,nums1);
		}
		int x = nums1.length;
		int y = nums2.length;
		int low = 0, high = x;
		
		while(low <= high) { //takes care of edge cases
			int partitionX = low + (high - low)/2;
			int partitionY = (x + y + 1)/2 - partitionX;
			System.out.println("partitionX: "+ partitionX);
			System.out.println("partitionY: "+ partitionY);

			
			int maxLeftX = (partitionX == 0)? Integer.MIN_VALUE : nums1[partitionX -1];
			int minRightX = (partitionX == x) ?Integer.MAX_VALUE :  nums1[partitionX];
			
			System.out.println("leftmax_x "+maxLeftX);
			System.out.println("rightmin_x "+minRightX);
			
			int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY -1];
			int minRightY = (partitionY == y) ?Integer.MAX_VALUE :nums2[partitionY];
			
			System.out.println("leftmax_y "+maxLeftY);
			System.out.println("rightmin_y "+minRightY);
			
			if((maxLeftX <= minRightY) && (maxLeftY <= minRightX)) {
				
				if((x+y)%2 == 0) {
					return (double) (Math.max(maxLeftY, maxLeftX) +
									Math.min(minRightX, minRightY))/2;
				}else {
					return (double) Math.max(maxLeftY, maxLeftX);
				}
			}else if(maxLeftX > minRightY){
				high = partitionX - 1;
			} else {
				low = partitionX + 1;
			}
		}
		throw new  IllegalArgumentException(); 
	}
		public static void main(String[] args) {
			
			int[] nums1 = {2};
			int[] nums2 = {};
			double median = findMedianSortedArrays(nums1, nums2);
			System.out.println(median + ":median");
			
		}
}
