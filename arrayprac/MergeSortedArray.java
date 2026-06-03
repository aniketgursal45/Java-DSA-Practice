package com.arrayprac;

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
    	int[] nums3=new int[m+n];
    	
    	int i=0;
    		for(int j=0;j<m;j++) {
    			nums3[i]=nums1[j];
    			i++;
    		}
    		for(int k=0;k<n;k++) {
    			
    			nums3[i]=nums2[k];
    			i++;
    		}
    		
    		Arrays.sort(nums3);
    		
    		for(int a=0;a<nums1.length;a++) {
    			nums1[a]=nums3[a];
    		}
    		
    		System.out.println(Arrays.toString(nums1));
    	
    	
    	
    }
    
}
class TestMSA{
	
	public static void main(String[] args) {
		
		int[] nums1= {1,2,3,0,0,0};
		int[] nums2= {2,5,6};
		
		int m=3;
		int n=3;
		
		MergeSortedArray m1=new MergeSortedArray();
		
		m1.merge(nums1, m, nums2, n);
		
	}
	
}
