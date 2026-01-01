package br.edu.fatecgru.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
		
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		int[] nums = {1, 2, 3, 1};
		int contador = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(hash.containsKey(nums[i]))
				contador++;
			
			hash.put(nums[i], i);
		}
		
		if(contador != 0)
			System.out.println(true);
		else
			System.out.println(false);
	}

}
