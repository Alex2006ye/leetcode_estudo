package br.edu.fatecgru.leetcode;

public class Palindromo {

	public static void main(String[] args) {
		//Given an integer x, return true if x is a palindrome, and false otherwise.
		
		int x = -1000;
		StringBuilder number = new StringBuilder();
		
		number.append(x);
		
		String numero = String.valueOf(number);
		
		StringBuilder reverse = number.reverse();
		
		String reverso = String.valueOf(reverse);
		
		if(numero.equals(reverso))
			System.out.println("Trata-se de um palíndromo");
		else
			System.out.println("Não é um palíndromo");
	}

}
