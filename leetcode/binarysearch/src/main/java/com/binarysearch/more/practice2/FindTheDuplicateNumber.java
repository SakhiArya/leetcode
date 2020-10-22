package com.binarysearch.more.practice2;

import java.util.HashMap;
import java.util.Map;

public class FindTheDuplicateNumber {
	
	public int findDuplicate(int[] nums) {
		
		Map<Integer,Integer> map = new HashMap<>();		
		for(int a : nums) {
				map.put(a, map.getOrDefault(a, 0)+1);
		}	
		for(Integer a : nums) {
			if(map.get(a) > 1) {
				return a;
			}
		}
		return -1;		
	}

}
