package com.fib;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		int n = sc.nextInt();
		
		System.out.print(0+" "+1 +" ");
		Fibonacci f = new Fibonacci(n);
		f.printNumbers();
		sc.close();
	}

}
