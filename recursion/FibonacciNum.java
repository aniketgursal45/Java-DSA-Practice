package com.recursion;

public class FibonacciNum {

	public int printF(int n) {
		
		if(n==1||n==0) {
			return n;
		}
		
		int fn1=printF(n-1);
		int fn2=printF(n-2);
		
		int fn=fn1+fn2;
		
		return fn;
		
	}
	
	
}
class TestFibonacciNum{
	
	public static void main(String[] args) {
		
		FibonacciNum f1=new FibonacciNum();
		
		int n=8;
		
		System.out.println(f1.printF(n));
		
		
		
	}
	
}
