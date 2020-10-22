//Peak element is an element whose neighbors are smaller than itself
//Peak Element can be the very first element or last or can be in between the array

/*Why "while(left < right)" - to avoid array index out of bound exception ,
as last element can be peak element if l==r while condition will be evaluated to true
which when used for mid in nums[mid +1] will throw Exception.
Why "r = mid"? - if we do mid +1 instead of mid the condition (ifnums[mid] >nums[mid+1])
		will not be evaluated for its immediate left neighbor for greater/less than
why return l? in case if peak is the last index of array , 
		as we are evenntually increasing l as mid + 1	*/	

package com.binarysearch.template2;

public class FindPeakElement {
	
	  public int findPeakElement(int[] nums) {
		  
		  int left = 0, right = nums.length - 1, mid;
		  while(left < right) {
			  mid = left +(right - left)/2;
			  if(nums[mid] > nums[mid+1]) {
				  right = mid;
			  }else {
				  left = mid + 1;
			  }
		  }
		  return left;
	  }

}
