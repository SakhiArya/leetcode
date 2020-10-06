//https://leetcode.com/explore/learn/card/binary-search/125/template-i/951/


/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

package com.binarysearch.template1;

public class GuessNumberHigherOrLower {

	   public int guessNumber(int n) {
		   
		   int left = 0 , right = n, mid, guessResult;
		   
		   while(left <= right) {
			   mid = left + (right - left)/2;
			   guessResult = guess(mid);
			   if(guessResult == 0) {
				   return mid;
			   }else if (guessResult == -1) {
				   right = mid -1;
			   }else {
				   left = mid + 1;
			   }
			   
		   }
		  return -1; 
		   
	   }
	   
	   //to avoid compilation error
	   int guess(int num) {
		   return -1;
	   }
	
}
