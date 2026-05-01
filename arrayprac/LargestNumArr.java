package com.arrayprac;

public class LargestNumArr {
	
	
	public int largestNumArr(int[] arr) {
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
			
			
		}
		
		
		return max;
		
	}

}

class TestApp{
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,6,3,5};
		
		LargestNumArr l1=new LargestNumArr();
		int max=l1.largestNumArr(arr);
		
		System.out.println("largest number in array is:- "+max);
	}
	
}
