package com.arrayprac;

import java.util.Arrays;

public class SingleNumber {
	
	public int singleNumber(int[] nums) {
		
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length-1;i+=2) {
			
			if(nums[i]!=nums[i+1]) {
				return nums[i];
			}
		}
		
		return nums[nums.length-1];
   
    }

}
class TestSNumber{
	public static void main(String[] args) {
		int[] nums= {2,1,2};
		
		SingleNumber s1=new SingleNumber();
		
		System.out.println(s1.singleNumber(nums));
	}
}

