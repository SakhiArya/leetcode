// Find First and Last Position of Element in Sorted Array
//Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//https://www.youtube.com/watch?v=bU-q1OJ0KWw

package com.binarysearch.template3;

public class FindRange {
	 public int[] searchRange(int[] nums, int target) {
		 
		 int [] response = new int[2];
		 response[0] = findStartingIndex(nums, target);
		 response[1] = findEndIndex(nums, target);
		 
		 return response;
	 }

	private int findEndIndex(int[] nums, int target) {
		int startIndex = -1 ;
		int left = 0, right = nums.length-1, mid;
		
		while(left <= right) {
			mid = left + (right-left)/2;
			if(nums[mid] <= target) {
				left = mid + 1;
			}else {
				right = mid -1;
			}
			
	    	if(nums[mid] ==target) {
			startIndex = mid;
		}
		}
		
		return startIndex;
	}

	private int findStartingIndex(int[] nums, int target) {
		int startIndex = -1 ;
		int left = 0, right = nums.length-1, mid;
		
		while(left <= right) {
			mid = left + (right-left)/2;
			if(nums[mid] >= target) {
				right = mid - 1;
			}else {
				left = mid + 1;
			}
			if(nums[mid] ==target) {
				startIndex = mid;
			}
		}
		
		return startIndex;
	}

}
