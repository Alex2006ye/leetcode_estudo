package br.edu.fatecgru.leetcode;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

		// You must write an algorithm with O(log n) runtime complexity.
		
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		int indexPossivel = 0, target = 4, index = 0, contador = 0;
		
		//Aqui ele verifica se o target existe no vetor
		for(int i = 0; i < array.length; i++) {
			if(array[i] == target)
				contador++;
		}
		
		//Se o contador for maior ou igual a 1, quer dizer que ele existe no vetor, e procura qual indice ele está
		if(contador >= 1) {
			for(int i = 0; i < array.length; i++) {
				if(array[i] == target)
					index = i;
			}
			
			System.out.println("O index que ele está é: " + index);
		}
		
		//Senão, é porque ele não existe no vetor, então procura o indice que ele poderia estar
		else {
			for(int i = 0; i < array.length; i++) {
				if(array[i] != target)
					if(target > array[i])
						indexPossivel = (i + 1);
			}
			
			System.out.println("O index que ele poderia estar é: " + indexPossivel);
		}
	}

}
