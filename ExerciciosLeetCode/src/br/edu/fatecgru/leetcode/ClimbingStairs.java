package br.edu.fatecgru.leetcode;

public class ClimbingStairs {

	public static void main(String[] args) {
		// You are climbing a staircase. It takes n steps to reach the top.

		// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
		
		int degraus = 3, primeiraForma = 1, segundaForma = 2, contador = 0;
		
		while(primeiraForma != degraus || segundaForma != degraus && contador < degraus) {
			if(primeiraForma < degraus)
				primeiraForma += 1;
			if(primeiraForma == degraus)
				contador++;
			if(segundaForma < degraus)
				segundaForma += 1;
			if(segundaForma ==  degraus)
				contador++;
			if((primeiraForma + segundaForma) < degraus) {
				primeiraForma += 2;
				segundaForma += 1;
			}
		}
		
		System.out.println("São necessários possíveis: " + contador + " possibilidades");

	}

}
