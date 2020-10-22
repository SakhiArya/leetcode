package com.binarysearch.template.analysis;

public class SearchInSortedArray {
	
	 public int search(ArrayReader reader, int target) {
		 if(reader.get(0) == target) {
			 return 0;
		 }	
		 int left = 0 , right = 1;
		 
		 while(right < target) {
				 left = right ;
				 right = right * 2;
		 }
		 int midValue, mid;
		 
		 while(left <= right) {
			 mid = left + (right - left)/2;
			 midValue = reader.get(mid);
			 if(midValue == target) {
				 return mid ;
			 }else if(midValue > target) {
				 right = mid -1;
			 }else {
				 left = mid + 1;
			 }
			 
		 }
		 
		 return -1;
	 }

}

//introducing for compilation error 
 class ArrayReader {
    public int get(int index) {
    	return 0;
    }
}