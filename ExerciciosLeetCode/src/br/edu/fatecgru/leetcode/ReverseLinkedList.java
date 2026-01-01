package br.edu.fatecgru.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// Given the head of a singly linked list, reverse the list, and return the reversed list.
		
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		List<Integer> reverseList = new ArrayList<Integer>();
		int i = lista.size() - 1;
		
		
		while(i >= 0) {
			reverseList.add(lista.get(i));
			i--;
		}
		
		System.out.println(reverseList);

	}

}
