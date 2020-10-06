/*1- take the middle and compare with target, if matches return.
2- if middle is bigger than left side, it means left is sorted
2a- if [left] < target < [middle] then do recursion with left, middle - 1 (right)
2b- left side is sorted, but target not in here, search on right side middle + 1 (left), right
3- if middle is less than right side, it means right is sorted
3a- if [middle] < target < [right] then do recursion with middle + 1 (left), right
3b- right side is sorted, but target not in here, search on left side left, middle -1 (right)


own language explanation:

at any pivot the array is divided in to 1 would be sorted and another unsorted 
figure out which side is sorted and check if the target is in the sorted array 
amend the start and end (left right accordingly)


*/

package com.binarysearch.template1;

public class SearchInRotatedArray {
	
    public int search(int[] nums, int target) {
    	
    	int left = 0, right = nums.length-1, mid;
    	
    	while(left <= right) {
    		mid = left + (right-left)/2;
    		if(target == nums[mid]) {
    			return mid;
    		}
    		else if(nums[left] <= nums[mid]) { //this means left is sorted
    			if(target < nums[mid] && target >= nums[left]) {
    				right = mid - 1;
    			}else {
    				left = mid + 1 ;
    			}
    		}else {
    			if(target >= nums[mid] && target <= nums[right]) { //here right is sorted 
    				left = mid +1;
    			}else {
    				right = mid - 1 ;
    			}
    		}
    	}
    	return -1;
    }
}
