package br.edu.fatecgru.leetcode;

public class ReduceToZero {

	public static void main(String[] args) {
		// In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
		
		int n = 14;
		int contador = 0;
		
		while (n != 0) {
			n = n/2;
			contador++;
			
			n--;
			contador++;
		}
		
		System.out.println("O número de passos dados para se chegar a zero foi: " + contador);

	}

}
