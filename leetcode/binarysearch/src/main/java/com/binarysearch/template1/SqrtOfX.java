/*I am confused after all these explanations. Some of them are plain wrong and are refuted in this thread.

Here is my take:
* We start at left=2, right=x/2. Every time, we find pivot=(left+right)//2.
* If pivot*pivot < x or pivot<sqrt(x), we move "left" pointer to pivot+1.
* If pivot*pivot > x or pivot>sqrt(x), we move "right" pointer to pivot-1.
* if pivot==sqrt(x), we exit early (e.g. 81).
* Thus, "left" converges towards sqrt(x) from below. "right" converges to sqrt(x) from above.

If "left" overshoots sqrt(x), the only pointer moved will be "right". Moving "right" to pivot-1 will result in the "right" pointer eventually undershooting sqrt. Hence, the convergence will stop with right<left.
* Since, the problem asks for a floor() or undershoot, we return "right".
* You can develop this into what happens if "right" undershoots sqrt before "left" overshoots it: "left" will just keep going pivot+1 until it overshoots sqrt and the "right" pointer.
Note: Overshooting or undershooting of sqrt can only happen by <1, because we only incr/decrement pivot by 1 when we move left/right pointers.usage_type


If the equality never happens it means left and right are a single digit apart and since we are looking for floor of the sqrt, we choose the smaller number (right).
Why they are single number apart? Because right mul right used to be higher than x, with decrement int it, we got right mul right lower than x, and the opposite for left.

( that is why you can return left - 1 as well)*/



package com.binarysearch.template1;

public class SqrtOfX {

	 public int mySqrt(int x) {
		 
		 if(x < 2) {
			 return x;
		 }
		 
		 int left = 2, right = x/2, mid;
		 long midSqr;
		 
		 while(left <= right) {
			 
			 mid = left + (right - left)/2;
			 midSqr =(long) mid * mid;
			 if(midSqr < x) {
				 left = mid + 1;
			 }else if(midSqr > x) {
				 right = mid -1;
			 }else {
				 return mid;
			 }
			 
		 }
		 return right ;
		 
	 }
}
