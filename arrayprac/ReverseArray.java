package com.arrayprac;

public class ReverseArray {

	
	public void reverseArray(int[] arr) {
		
		int temp=0;
		
		for(int i=0;i<arr.length/2;i++) {
			
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		
		
		
		
	}
	
	
	public void displayArray(int[] arr) {
		
		System.out.print("[ ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print(" ]");
	}
	
}

class TestR{
	
	public static void main(String[] args) {
		
		
		int[] arr= {2,4,6,8,10};
		
		ReverseArray r1=new ReverseArray();
		
		r1.reverseArray(arr);
		
		r1.displayArray(arr);
		
	}
	
}