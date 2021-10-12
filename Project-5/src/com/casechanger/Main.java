package com.casechanger;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();

		System.out.println("Enter your choice: ");
		System.out.println("1: All upper case ");
		System.out.println("2: All lower case ");
		System.out.println("3: Capitalize (capitalize the first letter of each word)");
		System.out.println("4: Sentence case (capitalize the first letter of the first word in a sentence)");
		System.out.println("5: Invert: lower to upper and upper to lower");
		int choice = sc.nextInt();
		CaseChanger c = new CaseChanger(s);
		switch(choice) {
			case 1: 
				System.out.println(c.toUpperCase());
				break;
			case 2: 
				System.out.println(c.toLowerCase());
				break;
			case 3: 
				System.out.println(c.capitalize());
				break;
			case 4: 
				System.out.println(c.sentenceCase());
				break;
			case 5: 
				System.out.println(c.swapCase());
				break;
			default :
				System.out.println(s);
				break;
		}
		sc.close();
	}

}
