package br.edu.fatecgru.leetcode;

public class SquareRoot {

	public static void main(String[] args) {
		// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

		// You must not use any built-in exponent function or operator.
		
		int valor = 25;
		
		for(int i = 1; i <= valor; i++) {
			if((i * i) == valor) {
				System.out.println("Essa é a raiz quadrada do: " + valor + " raiz: " + i);
				break;
			}
		}
	}

}
