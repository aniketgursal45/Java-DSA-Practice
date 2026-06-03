package com.arrayprac;

import java.util.Arrays;

public class  MajorityElement{

	public int majorityElement(int[] nums) {

		Arrays.sort(nums);

		int count = (nums.length - 1) / 2;

		int track = 1;
		int store = 0;

		for (int i = 0; i < nums.length; i++) {

			if (i == 0) {

				store = nums[i];
			}

			if (track > count) {
				return store;

			}

			if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
				
				track++;
				if (track > 0) {
					store = nums[i];
				}

			} else {
				track=1;
				if (track == 0) {
					store = 0;
				}
			}

		}

		return store;

	}
}

class TestPr {
	public static void main(String[] args) {

		MajorityElement e = new MajorityElement();

		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };

		System.out.println(e.majorityElement(nums));
	}
}