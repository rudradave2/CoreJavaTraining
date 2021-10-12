package com.ipoperations;

import java.util.Scanner;

public class Operations {

	/*
	 * Accept i/ps from User , till user enters "quit" or any other option. I/P :
	 * operation(add|sub|mult|div) , number1(double) , number2(double) Display the
	 * result of the operation. It should be done in a loop , till user enters
	 * "quit"
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			if (sc.hasNextInt()) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				System.out.println("Addition of " + x + " and " + y + " is " + (x + y));
				System.out.println("Substraction of " + x + " and " + y + " is " + (x - y));
				System.out.println("Multiplication of " + x + " and " + y + " is " + (x * y));
				System.out.println("Division of " + x + " and " + y + " is " + (x / y));
			}
			
		} while (!sc.nextLine().equals("quit"));
		
		sc.close();		
	}

}
