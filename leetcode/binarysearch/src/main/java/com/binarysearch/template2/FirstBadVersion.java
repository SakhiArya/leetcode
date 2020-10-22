/*the only possible combination is of false and true 
there can never be false true and then false 
use this property to deduce the logic*/


package com.binarysearch.template2;
public class FirstBadVersion {
	
	public int firstBadVersion(int n) {
		int left = 0 , right = n, res = -1,mid;
			
		while(left <= right) {
			mid = left + (right - left)/2;
			if(isBadVersion(mid)) {
				res = mid;
				right = mid -1;
			} else {
				left = mid + 1;
			}
		}
		return res;		
	}
	
	public int firstBadVersionSoln2(int n) {
		
		 int l=1;
	     int r = n;
	
	       while(l<r){
	            int mid = l + (r-l)/2;
	            if(isBadVersion(mid)){
	                r = mid;
	            }else{
	                l = mid+1;
	            }
	        }
	       return l;
	}

	//helper method to avoid compilation error 
	private boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
}
