package com.learnjava;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String [] args)
	{
		final int PERCENT = 100;
		final int MONTH_IN_YEAR = 12;
		final int MIN_AMOUNT = 1_000;
		final int MAX_AMOUNT = 1000_000;
		Scanner scanner = new Scanner(System.in);
		
		int principle = 0;
		int numberOfPayments = 0;
		float monthlyInterest = 0;
		
		// Validate principle value
		while (true)
		{
			System.out.print("Input principle (KZT 1K - 1M): ");
			principle = scanner.nextInt();
			if (principle  >= MIN_AMOUNT && principle <= MAX_AMOUNT)
			{
				break;
			}
			System.out.println("Enter a value between KZT 1K - 1M.");
			
		}
		
		// Validate interest value
		while (true)
		{
			System.out.print("Input interest rate: ");
			float annualInterest = scanner.nextFloat();
			if (annualInterest > 0 && annualInterest <= 30)
			{
				monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
				break;
			}
			System.out.println("Enter a value between 0 and 30.");
		} 
		
		
		// Validate years value
		while (true)
		{
			System.out.print("Input years: ");
			byte years = scanner.nextByte();
			if (years > 0 && years <= 30)
			{
				numberOfPayments = years * MONTH_IN_YEAR;
				break;
			}
			System.out.println("Enter a value between 0 and 30.");
		}
		
		// Calculate mortgage
		double tmp = Math.pow(1 + monthlyInterest, numberOfPayments);
		double mortgage = principle * (monthlyInterest * tmp) / (tmp - 1);
		
		String result = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Your monthly payment: " + result);
	}
}
