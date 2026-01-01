package br.edu.fatecgru.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;

public class MiddleLinkedList {

	public static void main(String[] args) {
		// Given the head of a singly linked list, return the middle node of the linked list.

        // If there are two middle nodes, return the second middle node.
		
		LinkedList<Integer> listinha = new LinkedList<>();
		
		listinha.add(1);
		listinha.add(2);
		listinha.add(3);
		listinha.add(4);
		listinha.add(5);
		
		int tamanho = listinha.size(), meio = tamanho/2;

		for(int i = meio; i < listinha.size(); i++) {
			System.out.println(listinha.get(i) + " ");
		}
	}

}
