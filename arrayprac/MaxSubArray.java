package com.arrayprac;

public class MaxSubArray {
	
	
	
	public int printMax(int[] arr) {
	
		int maxSum=Integer.MIN_VALUE;
		
		
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0+i;j<arr.length;j++) {
				
				int curSum=0;
				
				for(int k=i;k<=j;k++) {
					
					curSum=curSum+arr[k];
				
					
				}
				if(curSum>maxSum)
					maxSum=curSum;
				
			}
			
		}
		
		return maxSum;
		
	}
	
}

class TestA{
	
	public static void main(String[] args) {
		
		
		int[] arr= {1,-2,6,-1,3};
		
		MaxSubArray m1=new MaxSubArray();
		
		int maxSum=m1.printMax(arr);
		
		System.out.println("Maximum subArray sum is: "+maxSum);
		
		
	}
	
}