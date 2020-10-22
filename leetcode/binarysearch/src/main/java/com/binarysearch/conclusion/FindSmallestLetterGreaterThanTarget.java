/*The idea behind the approach 1 is to identify all the letters in array and store 
in step 2 move forward with target 1 by and and check in the stored array if the value is there 
as the array is sorted it is bound to be on incrementing side*/

/*Approach 2 is simply seaching for an elelment which is greater than the target in sorted array
*/

/*Approach 3 finds the position within array where the element can be substituted
if our insertion position says to insert target into the last position letters.
length, we return letters[0] instead.
		This is what the modulo operation does.*/

package com.binarysearch.conclusion;

public class FindSmallestLetterGreaterThanTarget {
	
	  public char nextGreatestLetter1(char[] letters, char target) {
		  boolean[] isSeen = new boolean[26];
		  
		  for(char c: letters) {
			  isSeen[c - 'a'] = true;
		  }
		  
		  while(true) {
			  target ++;
			  if(target > 'z') {
				  target = 'a';
			  }
			  if(isSeen[target - 'a']) {
				 return target; 
			  }
				  
		  }
	  }
	  public char nextGreatestLetter2(char[] letters, char target) {
		  
		  for(char c : letters) {
			  if(c > target) {
				  return c;
			  }
		  }
		  return letters[0];
	  }
	  
	  public char nextGreatestLetter3(char[] letters, char target) {
		  
		  int left = 0, right = letters.length, mid;
		  while(left < right) {
			  mid = left + (right - left)/2;
			  if(letters[mid] > target) {
				  right = mid;
			  }else {
				  left = mid +1;
			  }
		  }
		  return letters[left % letters.length];
	  }
}
