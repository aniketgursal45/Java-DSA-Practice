package com.sortingalgorithms;

public class SelectionSort {
	
	public void sort(int[] arr) {
		
		int temp=0;
	
		
		for(int i=0;i<arr.length-1;i++) {
			
			int min=i;
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[min]>arr[j]) {
							
					min=j;
					
				}
				
			}
			if(min!=i) {
				temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
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

class TestS{
	
	public static void main(String[] args) {
		
		int[] arr= {5,4,1,3,2};
		
		SelectionSort s1=new SelectionSort();
		
		s1.sort(arr);
		
		s1.display(arr);
	}
	
}