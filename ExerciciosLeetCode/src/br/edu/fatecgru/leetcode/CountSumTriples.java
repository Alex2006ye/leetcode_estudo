package br.edu.fatecgru.leetcode;

public class CountSumTriples {

	public static void main(String[] args) {
		// A square triple (a,b,c) is a triple where a, b, and c are integers and a2 + b2 = c2.
        // Given an integer n, return the number of square triples such that 1 <= a, b, c <= n.
		
		int n = 10, contador = 0;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				for(int c = 1; c <= n; c++) {
					if((i * i) + (j * j) == (c * c)) {
						contador++;
					}
				}
			}
		}
		
		System.out.println(contador);

	}

}
