package com.arrayprac;

public class MaxSubArrayByPrefix {

	public void maxSum(int[] arr) {
		
		int max=Integer.MIN_VALUE;
		
		int[] srr=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			if(i==0) {
				srr[i]=arr[i];
			}else {
				srr[i]=srr[i-1]+arr[i];
			}
			
		}
		
		
		
		
		for(int i=0;i<srr.length;i++) {
			
			int cur=0;
			
			for(int j=i;j<srr.length;j++) {
				
			
				cur=i==0?srr[j]:srr[j]-srr[i-1];
				
				if(cur>max) {
					max=cur;
				}
				
			}
			
			
			
		}
		
		System.out.println("Maximum sub array sum is: "+max);
		
	
		
		
	}
	
}

class PrefixTest{
	
	public static void main(String[] args) {
		
		int[] arr= {1,-2,6,-1,3};
		
		MaxSubArrayByPrefix m1=new MaxSubArrayByPrefix();
		
		m1.maxSum(arr);
		
		
		
	}
	
}

