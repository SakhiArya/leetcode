
/*Initial Condition: left = 0, right = length-1
Termination: left > right
Searching Left: right = mid-1
Searching Right: left = mid+1 /

1) we take (left <= right) in order to cover a case 
		while left = right and target is at the same place
		example [1,2,3] and target is 1
2) as left <= right, right needs to be length - 1 ;
3) why left = mid + 1 and right = mid - 1 ? in order to prevent infinite loop.	

*/


package com.binarysearch.template1;

public class BinarySearch {

	
	 public int search(int[] nums, int target) {
		 
		 if(nums == null || nums.length <1) {
			 return -1;
		 }
		 
		 int left = 0, right = nums.length -1 , mid;
		 
		 while(left <= right) {
			 mid = left +(right - left)/2;
			 if(nums[mid] == target) {
				 return mid;
			 }else if(nums[mid] < target) {
				 left = mid + 1 ;
			 }else {
				 right = mid - 1;
			 }	 
		 }
		 
		 return -1;
	 }
	
}
