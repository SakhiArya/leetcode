// Find minimum in a sorted but rotated array 
//the property of rotated index is: if you pick any element as pivot element 
//one side of the array will be sorted either left of the pivot or right of the pivot

package com.binarysearch.template2;

public class FindMinInRotatedSortedArray {
	
	 public int findMin(int[] nums) {
			 
		 int left = 0, right = nums.length-1, mid;
		 
		 while(left <= right) {
			 mid = left + (right - left)/2;
			 if(nums[mid] < nums[right]) {
				 right = mid;
			 }else {
				 left = mid + 1;
			 }
		 }
		 return nums[left];
	 }

}
