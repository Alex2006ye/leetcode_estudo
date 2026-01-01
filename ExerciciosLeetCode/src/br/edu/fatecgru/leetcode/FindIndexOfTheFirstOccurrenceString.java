package br.edu.fatecgru.leetcode;

public class FindIndexOfTheFirstOccurrenceString {

	public static void main(String[] args) {
		// Given two strings needle and haystack, return the index of the first 
		// occurrence of needle in haystack, or -1 if needle is not part of haystack.
		
		String haystack = "sadhaystack", needle = "leet";
		int contador = 0, contIndice = 0, indicePrimeira = 0, auxiliar = 0, contadorAux = 0;
		
		for(int i = 0; i < haystack.length(); i++) {
			for(int j = 0; j < needle.length(); j++) {
				if(needle.charAt(j) == haystack.charAt(i))
					contador++;
				if(contIndice == 0 && contador != 0) {
					contIndice++;
					indicePrimeira = i;
				}
			}
		}
		
		//Verificar repetições na contagem de letras na palavra (para evitar erros de contagem)
		for(int i = 0; i < needle.length(); i++) {
			
			while(auxiliar < haystack.length()) {
				if(needle.charAt(i) == haystack.charAt(auxiliar))
					contadorAux++;
				
				auxiliar++;
			}
			if(contadorAux >= 2)
				contador -= contadorAux - 1;
			
			contadorAux = 0;
			auxiliar = 0;
		}
		
		if(contador >= needle.length())
			System.out.println(indicePrimeira);
		else
			System.out.println(-1);
	}

}
