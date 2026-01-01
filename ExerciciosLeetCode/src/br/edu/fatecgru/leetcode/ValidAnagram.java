package br.edu.fatecgru.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

	public static void main(String[] args) {
		// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
		
		String s = "anagram", t = "nagrama";
		HashMap<Character, String> hash = new HashMap<Character, String>();
		HashMap<Character, String> hashzin = new HashMap<Character, String>();
		int contador = 0, sLetras = 0, tLetras = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(hash.containsKey(s.charAt(i)))
				sLetras++;
			hash.put(s.charAt(i), s);
			
			if(hashzin.containsKey(t.charAt(i)))
				tLetras++;
			hashzin.put(t.charAt(i), t);
		}
		
		for(Map.Entry<Character, String> entry : hashzin.entrySet()) {
			if(hash.containsKey(entry.getKey()))
				contador++;
		}
		
		if(contador + sLetras == s.length() && sLetras == tLetras)
			System.out.println(true);
		else
			System.out.println(false);
	}

}
