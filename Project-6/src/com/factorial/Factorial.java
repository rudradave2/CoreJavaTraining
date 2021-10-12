package com.factorial;

public class Factorial {

	int fact = 1;
	int count;
	
	public Factorial(int count) {
		this.count = count;
	}
	
	public int findFactorial() {
		for (int i = 1; i <= count; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
