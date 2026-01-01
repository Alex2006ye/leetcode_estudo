package br.edu.fatecgru.leetcode;

public class RansomNote {

	public static void main(String[] args) {
		// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

		String magazine = "ab", ransomnote = "aa";
		int contador = 0;
		
		for(int i = 0; i < magazine.length() - 1; i++) {
				if(ransomnote.charAt(i) == magazine.charAt(i)) {
					contador++;
				}
		}
		
		if(contador == ransomnote.length())
			System.out.println("É possível");
		else
			System.out.println("Não é possível");
	}

}
