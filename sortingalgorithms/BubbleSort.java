package com.sortingalgorithms;

public class BubbleSort {
	
	
	public void Sort(int[] arr) {
		
		int temp=0;
		
		for(int i=0;i<=arr.length-2;i++) {
			
			for(int j=0;j<=arr.length-2-i;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			
		}
		
	}
	
	public void display(int[] arr) {
		System.out.print("{ ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]+" ");
		}
		System.out.print(" }");
	}
	
	
	
	

}

class TestB{
	
	public static void main(String[] args) {
		
		int[] arr= {5,4,1,3,2};
		
		BubbleSort b1=new BubbleSort();
		
		b1.Sort(arr);		
		
		b1.display(arr);
		
	}
	
}
