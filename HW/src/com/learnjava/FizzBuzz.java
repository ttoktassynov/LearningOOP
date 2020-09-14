package com.learnjava;

import java.util.Scanner;

public class FizzBuzz
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number: ");
		int number = scanner.nextInt();
		String result;
		
		if (number % 5 == 0 && number % 3 == 0)
		{
			result = "FizzBuzz";
		}
		else if (number % 5 == 0)
		{
			result = "Fizz";
		}
		else if (number % 3 == 0)
		{
			result = "Buzz";
		}
		else
		{
			result = Integer.toString(number);
		}
		System.out.println(result);
		
	}
}