package com.factorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find factorial: ");
		int n = sc.nextInt();
		Factorial f = new Factorial(n);
		System.out.println("Factorial of " + n + " is " + f.findFactorial());
		sc.close();
	}

}
