package com.binarysearch.more.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArrayII {
	
	public int[] intersect(int[] nums1, int[] nums2) {
		
		Map<Integer, Integer> mapValue = new HashMap<>();
		for(int a: nums1) {
			mapValue.put(a, mapValue.getOrDefault(a, 0)+1);
		}
		int k = 0;
		for(int a: nums2) {
			int count = mapValue.getOrDefault(a,0);
			if(count > 0) {
				nums1[k++] = a;
				mapValue.put(a, --count);
			}
		}
		
		return Arrays.copyOfRange(nums1, 0, k);
	}

}
