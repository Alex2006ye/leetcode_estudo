package br.edu.fatecgru.leetcode;

public class MultiplyingTwoNums {

	public static void main(String[] args) {
		// You are given an array of integers nums. 
		//You are also given an integer original which is the first number that needs to be searched for in nums.
		
		int[] nums = {5, 3, 6, 1, 12};
		int original = 3, auxiliar = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(original == nums[i]) {
				auxiliar = nums[i] * 2;
				original = auxiliar;
			}
		}
		
		System.out.println(original);

	}

}
