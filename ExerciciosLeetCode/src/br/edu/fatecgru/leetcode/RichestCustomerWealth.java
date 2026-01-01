package br.edu.fatecgru.leetcode;


public class RichestCustomerWealth {

	public static void main(String[] args) {
		//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank.
		//Return the wealth that the richest customer has.

		//A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
		
		int[][] accounts = { {1, 2, 3}, 
				             {3, 2, 1} };
		int sum1 = 0, sum2 = 0;		
		for(int i = 0; i < accounts.length; i++) {
			for(int j = 0; j <= accounts.length; j++) {
				sum1 += accounts[0][j];
				sum2 += accounts[1][j];
			}
		}
		
		if(sum1 > sum2)
			System.out.println("O primeiro cliente é mais rico");
		else if(sum2 > sum1)
			System.out.println("O segundo cliente é mais rico");
		else
			System.out.println("Ambos são ricos");

	}

}
