package br.edu.fatecgru.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElementUsandoMap {
	
	public static void main(String[] args) {
		// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
		
		int[] nums = {3, 2, 3, 2, 2, 2, 4};
		int n = nums.length/2, contador = 1;
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 1; j < nums.length; j++) {
				if(nums[i] == nums[j])
					contador++;
			}
			
			hash.put(nums[i], contador);
			
			contador = 1;
		}
		
		int maior = 0, valorFinal = 0;
		
		for(Entry<Integer, Integer> entry : hash.entrySet()) {
			if(entry.getValue() > maior) {
				maior = entry.getValue();
				valorFinal = entry.getKey();
			}
		}
		
		System.out.println(valorFinal);
	}
	
}
