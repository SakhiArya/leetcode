//Sorted array with duplicate values

package com.binarysearch.more.practice;

public class FindMinimumInRotatedSortedArrayII {

	
	 public int findMin(int[] nums) {
		 
		 int left =0, right = nums.length-1, mid;
		 while(left < right) {
			 mid = left + (right - left)/2;
			 if(nums[mid] < nums[right]) {
				 right = mid;
			 }else if(nums[mid] > nums[right]){
				 left = mid + 1;
			 }else {
				 right = right - 1 ;
			 }
		 }
		 return nums[left];
	 }
}
