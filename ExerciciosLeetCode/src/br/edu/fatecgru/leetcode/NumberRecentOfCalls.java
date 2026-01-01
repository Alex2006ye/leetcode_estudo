package br.edu.fatecgru.leetcode;

import java.util.Queue;

public class NumberRecentOfCalls {

	public static void main(String[] args) {
		// Você está implementando uma classe chamada RecentCounter.

		// Ela recebe chamadas com um tempo t (em milissegundos), sempre em ordem crescente.

		//Para cada chamada ping(t), você deve retornar quantas chamadas aconteceram nos últimos 3000 ms, ou seja, no intervalo:
		
		int contador = 0;
		Queue<Integer> valor = null;
		
		valor.add(ping(1, contador));
		valor.add(ping(10, contador));
		valor.add(ping(100, contador));
		valor.add(ping(3001, contador));
		valor.add(ping(3002, contador));
		
		
		System.out.println(valor);
	}
	
	public static int ping(int t, int contador) {
		Queue<Integer> fila = null;
		fila.add(t - 3000);
		fila.add(t);
		
		contador++;
		
		return fila.remove();
	}

}
