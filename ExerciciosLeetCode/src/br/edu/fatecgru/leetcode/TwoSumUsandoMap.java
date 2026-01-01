package br.edu.fatecgru.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumUsandoMap {

	public static void main(String[] args) {
		// Two Sum (ID 1) — “Dado um array de inteiros nums e um inteiro target, retorne os índices dos dois números que somados dão target.”

		
		int target = 7, auxiliar = 0;
		int[] nums = {1, 2, 3, 4, 5};
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		
		// Resolvendo usando hash map em um único loop (primeiramente tentei fazer com dois, mas agora vejo que era possível só usar também)
		
		//Agora está com uma solução melhor, mas pra essa eu precisei de ajuda, nãooooooooo!
		for(int i = 0; i < nums.length; i++) {
			auxiliar = target - nums[i];
			
			if(hash.containsKey(auxiliar))
				System.out.println(hash.get(auxiliar) + " " + i);
			
			hash.put(nums[i], i);
			
			/*
			 * for(Map.Entry<Integer, Integer> entry : hash.entrySet()) { if(entry.getKey()
			 * == nums[i]) System.out.println(entry.getValue() + " " + i); }
			 */
		}
	}

}
