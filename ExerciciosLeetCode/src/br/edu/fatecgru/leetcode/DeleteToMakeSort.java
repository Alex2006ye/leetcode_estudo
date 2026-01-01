package br.edu.fatecgru.leetcode;

public class DeleteToMakeSort {

	public static void main(String[] args) {
		// You are given an array of n strings strs, all of the same length.
		// The strings can be arranged such that there is one on each line, making a grid.
		// You want to delete the columns that are not sorted lexicographically.
		
		//Esse eu falhei em resolver sozinho, tive que ver uma solução no próprio LeetCode e tentar entender
		//Mas para compensar, eu fiz para retornar os Índices das colunas
		
		String[] strs = {"dba","cza","egf"};
		int auxiliar = 0, s = strs.length, m = strs[0].length();
		int[] colunas = new int[s];
		
		for(int i = 0; i < s; i++) {
			for(int j = 1; j < m; j++) {
				if(strs[j].charAt(i) < strs[j - 1].charAt(i)) { 
					colunas[i]++;
					break;
				}
			}
		}
		
		for(int i = 0; i < s; i++) {
			if(colunas[i] > 0) {
				System.out.println("Índices das colunas para serem ordenadas/excluídas: " + i);
			}
		}
	}
}