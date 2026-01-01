package br.edu.fatecgru.leetcode;

public class ValidWord {

	public static void main(String[] args) {
		// A word is considered valid if:

		/*It contains a minimum of 3 characters.
		It contains only digits (0-9), and English letters (uppercase and lowercase).
		It includes at least one vowel.
		It includes at least one consonant.
		You are given a string word.

		Return true if word is valid, otherwise, return false. */
		
		String palavra = "007palhAco";
		int contMin = 0, contValido = 0;
		
		for(int i = 0; i < palavra.length(); i++) {
			contMin++;
		}
		
		for(int i = 0; i < palavra.length(); i++) {
			if(palavra.charAt(i) == 'A' || palavra.charAt(i) == 'E' || palavra.charAt(i) == 'I' || palavra.charAt(i) == 'O' || palavra.charAt(i) == 'U') 
				contValido++;
			else if(palavra.charAt(i) != 'a' && palavra.charAt(i) != 'e' && palavra.charAt(i) != 'i' && palavra.charAt(i) != 'o' && palavra.charAt(i) != 'u' && palavra.charAt(i) != 'A' && palavra.charAt(i) != 'E' && palavra.charAt(i) != 'I' && palavra.charAt(i) != 'O' && palavra.charAt(i) != 'U')
				contValido++;
			else if(palavra.charAt(i) == '0' || palavra.charAt(i) == '1' || palavra.charAt(i) == '2' || palavra.charAt(i) == '3' || palavra.charAt(i) == '4' || palavra.charAt(i) == '5' || palavra.charAt(i) == '6' || palavra.charAt(i) == '7' || palavra.charAt(i) == '8' || palavra.charAt(i) == '9')
				contValido++;
			else if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u')
				contValido++;
		}
		
		if(contMin >= 3) {
			if(contValido >= palavra.length())
				System.out.println("Palavra válida");
			else 
				System.out.println("Palavra Inválida");
		}
		else
			System.out.println("Palavra Inválida");
		

	}

}
