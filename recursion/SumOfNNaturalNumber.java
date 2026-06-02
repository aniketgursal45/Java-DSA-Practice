package com.recursion;

public class SumOfNNaturalNumber {
	
	int sum;
	int Tsum;
	public int printSum(int n) {
		
		if(n==1) {
			return 1;
		}
		
		sum=printSum(n-1);
		Tsum=sum+n;
		return Tsum;
		
	}

}
class TestNSum{
	
	public static void main(String[] args) {
		
		SumOfNNaturalNumber s1=new SumOfNNaturalNumber();
		int n=5;
		System.out.println(s1.printSum(n));
		
	}
}
