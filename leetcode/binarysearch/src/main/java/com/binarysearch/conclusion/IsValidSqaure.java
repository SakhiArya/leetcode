package com.binarysearch.conclusion;

public class IsValidSqaure {
	
	  public boolean isPerfectSquare(int num) {
		  if(num <2) {
			  return true;
		  }
		  long left = 2, right = num/2, mid, guessedNumberSquare;
		  
		  while(left <= right) {
			  mid = left +(right - left)/2;
			  guessedNumberSquare = mid * mid;
			  if(guessedNumberSquare == num) {
				  return true;
			  }else if(guessedNumberSquare > num) {
				  right = mid - 1;
			  }else {
				  left = mid + 1;
			  }
		  }
		  return false;
	  }
}
