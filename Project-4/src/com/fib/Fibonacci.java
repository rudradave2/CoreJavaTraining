package com.fib;

import java.util.Scanner;

public class Fibonacci {

	int n, a=0, b = 1, c = 0;
	
	public Fibonacci(int n) {
		this.n = n;
	}
	
	public void printNumbers() 
	{
		if (n > 0) {
			c  = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
			n--;
			printNumbers();
		}
	}
}
