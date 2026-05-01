package com.arrayprac;

public class BinarySearch {

	
	public int BSearch(int[] arr,int key) {
		
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
	
		while(start<=end) {
			
			if(key==arr[mid]) {
				return mid;
			}else if(key>arr[mid]) {
				start=mid+1;
			}else {
				end=mid-1;
			}
			
			mid=(start+end)/2;
		}
		
		return -1;
	}
	
}


class TestBSearch{
	
	public static void main(String[] args) {
		
		int[] arr={2,4,6,8,10,12,14};
		
		int key=10;
		
		BinarySearch b1=new BinarySearch();
		
		int res=b1.BSearch(arr, key);
		
		if(res>-1)
			System.out.println("found the key "+key+" at index: "+ res);
		else 
			System.out.println("Not found");
		
	}
	
}