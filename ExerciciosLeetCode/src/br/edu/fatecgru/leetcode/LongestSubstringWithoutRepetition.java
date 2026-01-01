package br.edu.fatecgru.leetcode;

public class LongestSubstringWithoutRepetition {

	public static void main(String[] args) {
		// Given a string s, find the length of the longest substring without duplicate characters.
		
		//Exercício nível médio!!
		
		String s = "abcabcbb";
		int contador = 1, valorFinal = 0;
		char letra = ' ';
		
		for(int i = 0; i < s.length(); i++) {
			letra = s.charAt(i);
			for(int j = 1; j < s.length(); j++) {
				if(letra != s.charAt(j)) {
					contador++;
				}
				else {
					if(valorFinal < contador)
						valorFinal = contador;
					contador = 1;
				}
			}
			contador = 0;
		}
		
		System.out.println(valorFinal);

	}

}
