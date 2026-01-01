package br.edu.fatecgru.leetcode;

public class RemoveElement {

	public static void main(String[] args) {		
		//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
		// The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
		
		int[] nums = {1, 2, 2, 3, 4, 7};
		int val = 2, contador = 0, indexFinal = 0, j = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == val) {
				contador++;
				nums[i] = -1;
			}
		}
		
		indexFinal = nums.length - contador;
		int[] array = new int[indexFinal];
				
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != -1) {
				System.out.println(nums[i]);
				array[j] = nums[i];
				j++;
			}
		}
	}
	
}
