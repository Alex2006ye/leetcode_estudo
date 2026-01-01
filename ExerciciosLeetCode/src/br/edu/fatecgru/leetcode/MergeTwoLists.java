package br.edu.fatecgru.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoLists {

	public static void main(String[] args) {
		List<Integer> lista1 = new ArrayList<Integer>();
		List<Integer> lista2 = new ArrayList<Integer>();
		List<Integer> lista3 = new ArrayList<Integer>();

		lista1.add(1);
		lista1.add(2);
		lista1.add(4);
		
		lista1.sort(null);
		
		lista2.add(1);
		lista2.add(3);
		lista2.add(4);
		
		lista2.sort(null);
		
		for(Integer i: lista1) {
			lista3.add(i);		
		}
		
		for(Integer i: lista2) {
			lista3.add(i);
		}
		
		lista3.sort(null);
		
		System.out.println(lista3);
	}

}
