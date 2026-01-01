package br.edu.fatecgru.leetcode;

public class SmallestIntegerDivisibleK {

	public static void main(String[] args) {
		//Given a positive integer k, you need to find the length of the smallest positive integer 
		// n such that n is divisible by k, and n only contains the digit 1.
		
		//Exercício de nível médio!
		
		int k = 30, n = -1, i = k, contador = 0;
		
		while(i > 0) {
			if(k % i == 0) {
				if(k == 1 && i == 1) {
					n = 1;
				}
				else if(i != 1) {
					n = i;
				}
				contador++;
			}
			i--;
		}
		
		if(n >= 10) {
			System.out.println(-1);
		}
		
		else if(contador <= 0) {
			n = -1;
		}
	
		System.out.println("O menor valor divisivel por k é: " + n);

	}

}
