package br.edu.fatecgru.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// Given two integer arrays nums1 and nums2, return an array of their intersection. 
		// Each element in the result must be unique and you may return the result in any order.
		
		int[] nums = {4, 5, 9}, nums2 = {3, 3, 2, 1, 9, 9, 4};
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		int index = 0;
		
		for(int i = 0; i < nums.length; i++) {
			while(index < nums2.length) {
				if(nums[i] == nums2[index])
					hash.put(i, nums[i]);
				index++;
			}
			index = 0;
		}
		System.out.println(hash.values());
	}

}
