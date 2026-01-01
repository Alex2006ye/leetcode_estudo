package br.edu.fatecgru.leetcode;

public class MinimumDivisibleThree {

	public static void main(String[] args) {
		// You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.

		// Return the minimum number of operations to make all elements of nums divisible by 3.
		
		int[] nums = {3, 6, 9};
		int target = 3, contador = 0, auxiliar = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 3 != 0) {
				auxiliar = nums[i] - 1;
				
				if(auxiliar % 3 == 0)
						contador++;
				
				else if(auxiliar % 3 != 0) 
					auxiliar = nums[i] + 1;
				
				else
					contador++;
			}
		}
		
		System.out.println("O número de operações necessárias é: " + contador);
	}

}
