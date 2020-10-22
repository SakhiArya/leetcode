/*Given a sorted array arr, two integers k and x, 
find the k closest elements to x in the array. The result should also be sorted in ascending order. 
If there is a tie, the smaller elements are always preferred.
*/
/*
Constraints:

1 <= k <= arr.length
1 <= arr.length <= 10^4
Absolute value of elements in the array and x will not exceed 104*/

/*
Since array is sorted, find index of the value closest to x (using binary search)
Expand left and right by k elements*/

package com.binarysearch.template3;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {
	
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		int closestIndex = binarySearch(arr,x);
		int left = closestIndex, right = closestIndex;
		
		while((right - left + 1)< k && left > 0 && right < arr.length - 1) {
			
			if(Math.abs(arr[left - 1]-x) <= Math.abs(arr[right + 1]-x)) {
				left --;
			}else {
				right ++;
			}
		}
		while(right - left +1 <k) {
			if(left >0) { //why?//
				left --;
			}else {
				right ++;
			}
		}
		List<Integer> arrRange = new ArrayList<>();
		
        while(left <= right){
            arrRange.add(arr[left]);
            left ++;
        }
		return arrRange;
	}

	private int binarySearch(int[] arr, int x) {
		int left =0, right = arr.length-1,mid, closest = -1, minDiff = Integer.MAX_VALUE;
		while(left <= right) {
			
			mid = left + (right - left)/2;
			int midValue = arr[mid];
			
			if(Math.abs(midValue - x) < minDiff) {
				minDiff = Math.abs(midValue - x);
				closest = mid;
			}
			if(arr[mid] == x) {
				return mid;
			}else if(arr[mid] < x) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
			
		}
		
		return closest;
	}

}
