package com.binarysearch.more.practice;

public class FindMinimumInRotatedSortedArray {
	
    public int findMin1(int[] nums) {
    	if(nums == null || nums.length < 1) {
    		return -1;
    	}
    	if(nums.length == 1 || nums[0] < nums[nums.length-1]) {
    		return nums[0];
    	}
    	int left = 0, right = nums.length-1, mid;
    	while(left <= right) {
    		mid = left + (right -left)/2;
			if(nums[mid] < nums[mid-1]) {
				return nums[mid] ;
			}
			if(nums[mid +1]< nums[mid]) {
				return nums[mid +1];
			}
    		if(nums[0] < nums[mid]) {
    			left = mid +1;
    		}else {
    			right = mid -1;
    		}
    	}
    	return -1;
    }
    
    public int findMin2(int[] nums) {
    	int left = 0, right = nums.length,mid;
    	while(left < right) {
    		mid = left + (right - left)/2;
    		if(nums[mid] < nums[right]) { //from mid to right the array is sorted 
    			right = mid;
    		}else {
    			left = mid + 1; //from left to mid is sorted
    		}
    	}
    	return nums[left];
    }
}
