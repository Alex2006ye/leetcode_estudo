package br.edu.fatecgru.leetcode;

public class NRepeatedElement {

	public static void main(String[] args) {
		// You are given an integer array nums with the following properties:

		// nums.length == 2 * n.
		// nums contains n + 1 unique elements.
		// Exactly one element of nums is repeated n times.
		// Return the element that is repeated n times.

		int[] nums = {1, 2, 2, 3, 4, 2};
		int n = 0, contador = 1, index = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(i * 2 == nums.length)
				n = i;
		}
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 1; j < nums.length; j++) {
				if(nums[i] == nums[j])
					contador++;
			}
			
			if(contador == n) {
				index = i;
				break;
			}
			
			contador = 0;
		}
		
		if(contador > 0)
			System.out.println("O número que se repete N vezes é: " + nums[index]);
		else
			System.out.println("Nenhum número se repete N vezes");
	}

}
