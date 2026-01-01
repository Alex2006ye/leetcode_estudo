package br.edu.fatecgru.leetcode;


public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		
		// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element 
		// appears only once. The relative order of the elements should be kept the same.
		
		
		int[] array = {1, 2, 3, 4, 5, 5, 6};
		
		int auxiliar = 0, contador = 0, j = 0, indice = 0;
		
		for(int i = 0; i < array.length; i++) {
			auxiliar = array[i];
			
			while(j < array.length) {
				if(array[j] == array[i]) {
					contador++;
					indice = i;
				}
				j++;
			}
			
			if(contador >= 2) {
				array[indice] = 0;
			}
			
			j = 0;
			contador = 0;
		}
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 0) {
				contador++;
			}
		}
		
		while(array[j] != 0) {
			j++;
		}
		
		for(int i = j; i < array.length; i++) {
			if(array != null && i + 1 < array.length) {
				array[i] = array[i + 1];
			}
     }
		
		for(int i = 0; i < array.length - contador; i++) {
			System.out.println(array[i]);
		}

	}

}
