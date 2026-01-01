package br.edu.fatecgru.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RansomNoteHashMap {

	public static void main(String[] args) {
		// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
		
		String magazine = "ab", ransomnote = "ba";
		char auxiliar = ' ';
		int contador = 0;
		HashMap<Integer, Character> hash = new HashMap<Integer, Character>();
		HashMap<Integer, Character> hashzin = new HashMap<Integer, Character>();
		
		for(int i = 0; i < ransomnote.length(); i++) {
			hash.put(i, ransomnote.charAt(i));
		}
		
		for(int i = 0; i < magazine.length(); i++) {
			hashzin.put(i, magazine.charAt(i));
		}
		
		for(Entry<Integer, Character> entry : hash.entrySet()) {
			if(hashzin.containsValue(entry.getValue()) && auxiliar != entry.getValue()) {
				contador++;
				auxiliar = entry.getValue();
			}
		}
		
		if(contador == ransomnote.length())
			System.out.println(true);
		else
			System.out.println(false);
	}

}
