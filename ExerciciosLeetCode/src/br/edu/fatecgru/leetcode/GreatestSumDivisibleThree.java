package br.edu.fatecgru.leetcode;

public class GreatestSumDivisibleThree {

	public static void main(String[] args) {
		// Given an integer array nums, return the maximum possible sum of elements of the array such that it is divisible by three.

		//Exercicio de nível médio do LeetCode!!
		
		int[] nums = {2, 6, 2, 2, 7}, auxiliar = new int[nums.length];
		int soma = 0, contador = 0, variavel = 0, cont = 0;
		
		for(int i = 0; i < nums.length; i++) {
				soma += nums[i];
		}
		
		if(soma % 3 == 0) {
			System.out.println(soma);
		}else {
		
		while(contador < nums.length) {
			if((soma - nums[contador]) % 3 == 0 && (soma - nums[contador]) != 0) {
				auxiliar[contador] = soma - nums[contador];
				cont++;
			}
			contador++;
		}
		
		if(cont > 0) {
			
		for(int i = 0; i <= cont; i++) {
			if(auxiliar[i] > variavel) {
				variavel = auxiliar[i];
			}
		}
		
	}
		
		System.out.println(variavel);
	}
		
	}
}
