package com.sortingalgorithms;

public class InsertionSort {
	
	public void sort(int[] arr) {
		

		
		for(int i=0;i<arr.length;i++) {
			
		
			int cur=arr[i];
			int prev=i-1;
			
			while(prev>=0 && arr[prev]>cur) {
				
				arr[prev+1]=arr[prev];
				prev--;
				
				
			}
			
			arr[prev+1]=cur;
			
		}
		
		
	}
	
	
	public void diplay(int[] arr) {
		
		System.out.print("{ ");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(" "+arr[i]+" ");
			
		}
		System.out.print(" }");
		
	}
	

}

class TestI{
	
	public static void main(String[] args) {
		
		int[] arr= {5,4,1,3,2};
		
		InsertionSort i1=new InsertionSort();
		
		i1.sort(arr);
		
		i1.diplay(arr);
		
		
	}
	
}