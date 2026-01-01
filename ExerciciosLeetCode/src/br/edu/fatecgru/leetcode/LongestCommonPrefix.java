package br.edu.fatecgru.leetcode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// Write a function to find the longest common prefix string amongst an array of strings.

        // If there is no common prefix, return an empty string "".
		
		String[] string = {"flow", "flop", "flower", "flame"};
		String prefixo = "fl";
		int auxiliar = 0;
		
		for(int i = 0; i < string.length; i++) {
			for(int j = 1; j < string.length; j++) {
				if(string[i].startsWith(prefixo) == string[j].startsWith(prefixo))
					auxiliar++;
			}
		}
		auxiliar = auxiliar/(string.length - 1);
				
		if(auxiliar >= string.length) {
			System.out.println("Todas as strings começam com o mesmo prefixo: " + prefixo);
		}

	}

}
