//Implement pow(x, n), which calculates x raised to the power n (i.e. x).
package com.binarysearch.conclusion;

public class Power {
	
	 public double myPow(double x, int n) { 
		 long N = n;
		 if(N < 0) {
			 N = -N; //makes it positive
			 x= 1/x;
		 }
		 double result = 1;
		 
		 while(N >0) {
			 if(N %2 ==1) { //for extra multiplication
				 result = result * x;
			 }
			 x= x*x;
			 N = N/2;
		 }
		 return result;	 
	 }

}
