package br.edu.fatecgru.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RomanoParaInteiro {

	public static void main(String[] args) {
		// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
		
		String romano = "LV";
		char auxiliar = ' ';
		int numero = 0;
		
		for(int i = 0; i < romano.length(); i++) {
			if(romano.charAt(i) == 'I' || romano.charAt(i) == 'i') {
				numero += 1;
				auxiliar = romano.charAt(i);
			}
			 if(romano.charAt(i) == 'V' || romano.charAt(i) == 'v') {
				if(numero < 5 || auxiliar == 'I' || auxiliar == 'i') { 
					numero = 5 - numero;
					auxiliar = romano.charAt(i);
				}
				else {
					numero += 5;
					auxiliar = romano.charAt(i);
				}
			}
			if(romano.charAt(i) == 'X' || romano.charAt(i) == 'x') {
				if(numero < 10 && auxiliar == 'I' || auxiliar == 'i') {
					numero = 10 - 1;
					auxiliar = romano.charAt(i);
				}
				else if(numero < 10 && auxiliar == 'V' || auxiliar == 'v') {
					numero = 10 - 5;
					auxiliar = romano.charAt(i);
				}
				else {
					numero += 10;
					auxiliar = romano.charAt(i);
				}
			}
			if(romano.charAt(i) == 'L' || romano.charAt(i) == 'l') {
				if(numero < 50 && auxiliar == 'I' || auxiliar == 'i') {
					numero = 50 - 1;
					auxiliar = romano.charAt(i);
				}
				else if(numero < 50 && auxiliar == 'V' || auxiliar == 'v') {
					numero = 50 - 5;
					auxiliar = romano.charAt(i);
				}
				else if(numero < 50 && auxiliar == 'X' || auxiliar == 'x') {
					numero = 50 - 10;
					auxiliar = romano.charAt(i);
				}
				else {
					numero += 50;
					auxiliar = romano.charAt(i);
				}
			}
			if(romano.charAt(i) == 'C' || romano.charAt(i) == 'c') {
				if(numero < 100 && auxiliar == 'I' || auxiliar == 'i') { 
					numero = 100 - 1;
					auxiliar = romano.charAt(i);
				}
				else if(numero < 100 && auxiliar == 'V' || auxiliar == 'v') {
					numero = 100 - 5;
					auxiliar = romano.charAt(i);
				}
				else if(numero < 100 && auxiliar == 'X' || auxiliar == 'x') {
					numero = 100 - 10;
					auxiliar = romano.charAt(i);
				}
				else if(numero < 100 && auxiliar == 'L' || auxiliar == 'l') {
					numero = 100 - 50;
					auxiliar = romano.charAt(i);
				}
				else {
					numero += 100;
					auxiliar = romano.charAt(i);
				}
			}
			if(romano.charAt(i) == 'M' || romano.charAt(i) == 'm') {
				if(numero < 1000 && auxiliar == 'I' || auxiliar == 'i') { 
					numero = 1000 - 1;
					auxiliar = romano.charAt(i);
				}
				else if(numero < 1000 && auxiliar == 'V' || auxiliar == 'v') {
					numero = 1000 - 5;
					auxiliar = romano.charAt(i);
				}
				else if(numero < 1000 && auxiliar == 'X' || auxiliar == 'x') {
					numero = 1000 - 10;
					auxiliar = romano.charAt(i);
				}
				else if(numero < 1000 && auxiliar == 'L' || auxiliar == 'l') {
					numero = 1000 - 50;
					auxiliar = romano.charAt(i);
				}
				else if(numero < 1000 && auxiliar == 'C' || auxiliar == 'c') {
					numero = 50 - 5;
					auxiliar = romano.charAt(i);
				}
				else
					numero += 1000;
		    }
		}
		
		System.out.println("Esse é o valor em Romano: " + romano);
		System.out.println();
		System.out.println("Esse é o valor em Inteiro: " + numero);

	}

}
