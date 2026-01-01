package br.edu.fatecgru.leetcode;

public class FizzBuzz {

	public static void main(String[] args) {
		
		int n = 3;
		String[] answer = new String[n];
		
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0 && i % 5 == 0 && i != 0)
				answer[i - 1] = "Fizz Buzz";
			else if (i % 3 == 0 && i != 0)
				answer[i - 1] = "Fizz";
			else if(i % 5 == 0 && i !=0)
				answer[i - 1] = "Buzz";
			else if(i != 0 && i % 3 != 0 && i % 5 != 0)
				answer[i - 1] = String.valueOf(i);
		}
		
		
		for(int i = 0; i < n; i++)
		{
			System.out.println(answer[i]);
		}

	}

}
