package br.edu.fatecgru.leetcode;

public class TwoBestNonOverlappingEvents {

	public static void main(String[] args) {
		// You are given a 0-indexed 2D integer array of events where events[i] = [startTimei, endTimei, valuei]. 
		// The ith event starts at startTimei and ends at endTimei, and if you attend this event, you will receive a value of valuei.
		// You can choose at most two non-overlapping events to attend such that the sum of their values is maximized.
		// Return this maximum sum.
		// Note that the start time and end time is inclusive: that is, 
		// you cannot attend two events where one of them starts and the other ends at the same time. 
		// More specifically, if you attend an event with end time t, the next event must start at or after t + 1.
		
		//Exercício Nível Médio!!
		
		int[][] eventos = {{1, 3, 2}, {4, 5, 2}, {1, 5, 5}};
		int contador = 1, finalEventoMax = 0, numLinhas = 0, numColunas = 0, maiorValor = 0, auxiliar = 0;
		
		for(int i = 0; i < eventos.length; i++) {
			if(eventos[i][2] > maiorValor)
				maiorValor = eventos[i][2];
		}
		
		for(int i = 0; i < eventos.length; i++) {
			if(eventos[i][1] > finalEventoMax)
				finalEventoMax = eventos[i][1];
		}
		
		for(int i = 0; i < eventos.length; i++) {
			numLinhas++;
		}
		
		for(int i = 0; i < eventos.length; i++) {
			numColunas++;
		}
		
		for(int i = 0; i < numLinhas; i++) {
			for(int j = 1; j < numColunas; j++) {
				if(eventos[i][0] == 1 && eventos[j][0] == (eventos[i][1] + 1))
					contador = eventos[i][2] + eventos[j][2];
				if(eventos[i][2] == maiorValor && eventos[i][0] == 1) {
					contador = maiorValor;
				}
				
				if(contador > auxiliar)
					auxiliar = contador;
			}
		}
		
		/*
		 * for(int i = 0; i < numLinhas; i++) { if((eventos[i][1] - eventos[i][0]) <=
		 * finalEventoMax && eventos[i][0] == 1) contador += eventos[i][2];
		 * if((eventos[i][1] - eventos[i][0]) <= finalEventoMax && eventos[i][0] ==
		 * (contador + 1)) contador += eventos[i][2]; if((eventos[i][1] - eventos[i][0])
		 * <= finalEventoMax && eventos[i][0] == 1 && eventos[i][2] == finalEventoMax) {
		 * contador = 0; contador = eventos[i][2]; } }
		 */
		
		System.out.println(auxiliar);

	}

}
