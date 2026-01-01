package br.edu.fatecgru.leetcode;

public class MajorityElement {

	public static void main(String[] args) {
		// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
		
		int[] nums = {3, 2, 3, 2, 2, 2, 4};
		int n = nums.length/2, frequente = 0, contador = 1, contMaior = 0;
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 1; j < nums.length; j++) {
				if(nums[i] == nums[j])
					contador++;
			}
			
			if(contador > n && contador > contMaior) {
				frequente = nums[i];
				contMaior = contador;
			}
			contador = 1;
		}
		
		System.out.println(frequente);
	}

}
