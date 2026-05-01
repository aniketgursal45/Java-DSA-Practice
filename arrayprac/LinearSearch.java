package com.arrayprac;

public class LinearSearch {
	
	public int applyLinearSearch(int key,int[] arr) {
		
		int index=-1;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==key) {
				index= i;
				break;
			}
		}
		
		
		return index;
		
	}

}

class TestSearchP{

	public static void main(String[] args) {
		
		int arr[]= {2,4,6,8,10,12,14,16};
		int key =10;
		
		LinearSearch l1=new LinearSearch();
		
		int res=l1.applyLinearSearch(key, arr);
		if(res>-1)
			System.out.println("Found at index:- "+res);
		else
			System.out.println("Key is not found");
		
	}
}