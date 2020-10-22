package com.binarysearch.more.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public int[] intersection(int[] nums1, int[] nums2) {
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Map<Integer,Integer> map = new HashMap<>();
		for(int a: nums1) {
			set1.add(a);
		}
		for(int a: nums2) {
			if(set1.contains(a)) {
				set2.add(a);
			}
		}
		int outputArray[] = set2.stream().mapToInt(Integer :: intValue).toArray();
		return outputArray;
	}
}
