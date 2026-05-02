package com.arrayprac;

public class MaxSubArrBykadan {

	
	public void maxCal(int[] arr) {
		
		int max=Integer.MIN_VALUE;
		
		int cur=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
			if(i==0) {
				cur=arr[i];
			}else {
				cur=Math.max(arr[i], arr[i]+cur);
			}
			
			if(cur>max) {
				max=cur;
			}
			
		}
		
		System.out.println("Maximum sub array sum is: "+max);
	}
	
}

class TestKadan{
	
	public static void main(String[] args) {
		
		int[] arr= {-2,-3,4,-1,-2,1,5,-3};
		
		MaxSubArrBykadan m1=new MaxSubArrBykadan();
		
		m1.maxCal(arr);
		
	}
	
}
