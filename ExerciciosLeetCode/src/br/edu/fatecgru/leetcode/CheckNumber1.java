package br.edu.fatecgru.leetcode;

public class CheckNumber1 {

	public static void main(String[] args) {
		// Given an binary array nums and an integer k 
		//return true if all 1's are at least k places away from each other, otherwise return false.
		
		int[] nums = {1, 0, 0, 0, 1, 0, 0, 1};
		int k = 2, auxiliar = 0, contador = 0, contador1 = 1;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1)
				auxiliar = 1;
			
			if(nums[i] == 1)
				contador = 0;
			else if(nums[i] == 0)
				contador++;
			
			if(contador == k) {
				System.out.println("O número 1 está na distância permitida");
				contador1++;
			}
		}
		
		System.out.println();
		
		if(contador1 >= k) {
			System.out.println("Os números 1 estão nos locais devidamente corretos");
		}
		else
			System.out.println("Um, ou todos os números 1 não estão na devida posição");

	}

}
