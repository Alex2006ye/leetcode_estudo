package br.edu.fatecgru.leetcode;

import java.util.List;

public class PlusOne {

	public static void main(String[] args) {
		// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
		// The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
		//Increment the large integer by one and return the resulting array of digits.
		
		int[] array = {1, 2, 3, 4, 6, 1, 4, 9};
		int auxiliar = 0, contador = 0;
		String numero = "";
		
		//aqui ele pega os valores do array, transforma em string e adiciona na string vazia 
		//e nos casos que for necessário, concatena com o que já estiver na string
		for(int i = 0; i < array.length; i++) {
			
			if((i + 1) == array.length && numero.equals(""))
				numero = String.valueOf(array[i] + 1);
			
			if(numero.equals(""))
				numero = String.valueOf(array[i]);
			else 
				if(!numero.equals("") && (i + 1) < array.length)
					numero += String.valueOf(array[i]);
			
			if((i + 1) == array.length && !numero.equals(""))
				numero += String.valueOf(array[i] + 1);
		}
		
		//aqui ele conta quantas letras possui nessa string (no caso, quantos números estão nela)
		for(int i = 0; i < numero.length(); i++) {
			contador++;
		}
		
		//cria um array auxiliar usando o valor do contador anterior para se usar como tamanho do array
		int[] arrayAux = new int [contador];
		
		
		//aqui serve para transformar de volta os valores da string, para o array de inteiros 
		for(int i = 0; i < contador; i++) {
			arrayAux[i] = Character.getNumericValue(numero.charAt(i));
		}
		
		//aqui printa o array
		for(int i = 0; i < arrayAux.length; i++) {
			System.out.print("[" + arrayAux[i] + "]");
		}
	}

}
