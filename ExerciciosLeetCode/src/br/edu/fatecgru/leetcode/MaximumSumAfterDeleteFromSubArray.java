package br.edu.fatecgru.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MaximumSumAfterDeleteFromSubArray {

	public static void main(String[] args) {
		//You are given an integer array nums.

		// You are allowed to delete any number of elements from nums without making it empty.

		// All elements in the subarray are unique.
		// The sum of the elements in the subarray is maximized.
		// Return the maximum sum of such a subarray.
		
		int[] nums = {1,2,-1,-2,1,0,-1};
		int contador = 0, sum = 0, auxiliar = 0;
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 1; j < nums.length; j++) {
				if(nums[i] == nums[j] && i != j) {
					contador++;
					break;
				}
			}
		}
		
		List<Integer> indices = new ArrayList<>(contador - 1);
		
		if(contador <= 0) {
			for(int i = 0; i < nums.length; i++) {
				sum += nums[i];
			}
			
			System.out.println("A soma do subarray é: " + sum);
		} else {
			
			for(int i = 0; i < nums.length; i++) {
				for(int j = 1; j < nums.length; j++) {
				if(nums[i] == nums[j] && i != j) {
					indices.add(i);
					break;
				}
			}
		}
			System.out.println(indices);
			
			for(int i = 0; i < indices.size(); i++) {
				if(i != indices.get(i))
					sum += nums[i];
			}
		
			System.out.println("A soma do subarray é: " + sum);
	   }
  }
}
