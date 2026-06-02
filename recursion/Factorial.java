package com.recursion;

public class Factorial {

	static int fac=1;
	public static int factorial(int n) {
		
		if(n==0) {
			return 1;
		}
		int fnm1=factorial(n-1);
		int fn=n*fnm1;
		return fn;
		
	}
	
	
	public static void main(String[] args) {
		
		int n=2;
		
		System.out.println("Factorial of "+n+" is:- "+ factorial(n));
		
	}
}
