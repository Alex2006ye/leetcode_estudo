
package br.edu.fatecgru.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {

	public static void main(String[] args) {
		// Reverse Integer (ID 7) — “Dado um inteiro, inverta os dígitos, exemplo, 123 vira 321, -123 vira -321. Se o valor invertido ultrapassar os limites de 32-bits, retorne 0.”

		//Só consegui reverter com quatro dígitos 
		int valor = 351, indiceSinal = 0;
		String auxiliar = "";
		String valorFinal = "";
		char sinal = 0;
		
		String novoValor = String.valueOf(valor);
		
		//loop para inverter o valor
		for(int i = novoValor.length() - 1; i >= 0; i--) {
			if(novoValor.charAt(i) == '-')
				sinal += novoValor.charAt(i);
			
			auxiliar += novoValor.charAt(i);
		}
		
		//verifica se possui sinal de negativo ou não
		if(sinal == '-') {
			for(int i = 0; i < auxiliar.length(); i++) {
				if(auxiliar.charAt(i) == '-')
					indiceSinal = i;
			}
			
			valorFinal += auxiliar.charAt(indiceSinal);
			
			for(int i = 0; i < auxiliar.length(); i++) {
				if(auxiliar.charAt(i) == '-')
					break;
					
				valorFinal += auxiliar.charAt(i);
			}
			
			System.out.println(valorFinal);
		}
		
		System.out.println(auxiliar);
		
	}

}
