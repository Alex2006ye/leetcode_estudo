package br.edu.fatecgru.leetcode;

public class AddBinary {

	public static void main(String[] args) {
		// Given two binary strings a and b, return their sum as a binary string.
		
		String a = "11", b = "1";
		String valorFinal = "";
		int aInteiro = 0, bInteiro = 0;
		
		for(int i = 0; i < 100; i++) {
			if(Integer.toBinaryString(i).equals(a)) {
				aInteiro = i;
			}
		}
		
		for(int i = 0; i < 100; i++) {
			if(Integer.toBinaryString(i).equals(b)) {
				bInteiro = i;
			}
		}
		
		int valor = aInteiro + bInteiro;
		
		valorFinal = Integer.toBinaryString(valor);
		
		System.out.println(valorFinal);
	}

}
