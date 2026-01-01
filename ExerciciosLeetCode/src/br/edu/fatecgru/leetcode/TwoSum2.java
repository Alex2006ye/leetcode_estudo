package br.edu.fatecgru.leetcode;

import java.util.Arrays;

public class TwoSum2 {

	public static void main(String[] args) {
		// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. 
		// Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
		// Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
		
		//Exercício de nível médio
		
		int[] array = {2, 1, 7, 9, 5, 4};
		int target = 9;
		int x = 0, y = array.length - 1, contador = 0;
		
		Arrays.sort(array); //1, 2, 4, 5, 7, 9
		
		while(contador == 0) {
			if(array[x] + array[y] == target) {
				System.out.println((x + 1) + " " + (y + 1));
				contador++;
			}
			
			if(array[x] + array[y] < target) {
				x++;
			}
			
			if(array[x] + array[y] > target) {
				y--;
			}
		}
		System.out.println("Esses acima são os índices dos valores somados +1! ");
	}

}
