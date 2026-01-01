package br.edu.fatecgru.leetcode;

public class ValidParentheses {

	public static void main(String[] args) {
		// “Dada uma string contendo apenas os caracteres ‘(’, ‘)’, ‘{’, ‘}’, ‘[’, ‘]’, 
		//determine se a string é válida. Uma string é válida se: cada abertura tem correspondente de fechamento no mesmo tipo, e na ordem correta.”
		
		String str = "(){}[]";
		int contador = 0, cont = 0;

		System.out.println(str.length());
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
				cont++;
		}
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(' && str.charAt(i + 1) == ')')
				contador++;
			if(str.charAt(i) == '{' && str.charAt(i + 1) == '}')
				contador++;
			if(str.charAt(i) == '[' && str.charAt(i + 1) == ']')
				contador++;
		}
		
		System.out.println(contador);
		
		if(contador == cont)
			System.out.println("String válida");
		else
			System.out.println("String inválida");
	}

}
