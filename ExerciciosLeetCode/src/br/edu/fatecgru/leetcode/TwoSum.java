package br.edu.fatecgru.leetcode;

public class TwoSum {

	public static void main(String[] args) {

		//Two Sum (ID 1) — “Dado um array de inteiros nums e um inteiro target, retorne os índices dos dois números que somados dão target.”
		
		int target = 7;
		int[] nums = {1, 2, 3, 4, 5};
		
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 1; j < nums.length; j++)
			{
				if(nums[i] + nums[j] == target) {
					System.out.println("Esses são os índices: " + i + " " + j);
				}
			}
		}
	}

}
