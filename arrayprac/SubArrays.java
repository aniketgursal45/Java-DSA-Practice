package com.arrayprac;

public class SubArrays {

	public void printSubArray(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0+i;j<arr.length;j++) {
				
				for(int k=i;k<=j;k++) {
					
					System.out.print(" "+arr[k]+" ");
					
				}
				System.out.println();
				
			}
			System.out.println();
			
		}
		
	}
	
}

class TestS{
	
	public static void main(String[] args) {
		
		int[] arr= {2,4,6,8,10};
		
		SubArrays s1=new SubArrays();
		
		s1.printSubArray(arr);
	}
	
	
}
