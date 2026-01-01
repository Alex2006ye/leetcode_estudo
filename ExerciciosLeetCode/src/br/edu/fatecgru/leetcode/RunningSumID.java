package br.edu.fatecgru.leetcode;

public class RunningSumID {

	public static void main(String[] args) {
		// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
		
		        //Input: nums = [1,2,3,4]
				//Output: [1,3,6,10]
				//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
		
		int[] nums = {1, 2, 3, 4};
		int[] sum = new int [nums.length];
		int auxiliar = 0;
		
		for(int i = 0; i < nums.length; i++) {
			sum[i] += nums[i] + auxiliar;
			auxiliar = sum[i];
	}
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(sum[i]);
		}

}
	
}
