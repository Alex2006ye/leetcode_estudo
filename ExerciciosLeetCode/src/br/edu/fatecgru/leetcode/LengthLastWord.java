package br.edu.fatecgru.leetcode;

public class LengthLastWord {

	public static void main(String[] args) {
		// Given a string s consisting of words and spaces, return the length of the last word in the string.
		
		String str = "Palmeiras Tita Brasileiro";
		int contador = 0;
		int j = 0;
		int vazios = 0;
		int auxiliar = 0;
		
		//Contador para todos os espaços vazios entre as palavras
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				vazios++;
			}
		}
		
		
		//Contador para encontrar qual a última palavra
		while(!(str.charAt(j) == ' ') && auxiliar != vazios) {
			
			if(str.charAt(j) == ' ') {
				auxiliar++;
			}
			
			j++;
		}
		
		j++;
		
		//Subtração final para obter o comprimento da palavra
		contador = str.length() - j;
		
		System.out.println("Esse é o comprimento da última palavra: " + contador);

	}

}
