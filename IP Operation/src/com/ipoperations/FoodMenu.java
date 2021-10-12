package com.ipoperations;

import java.util.Scanner;

public class FoodMenu {

	 /* 
	 * 3. Display food menu to user. User will select items from menu along with the
	 * quantity. (eg 1. Dosa 2. Samosa .......10 . Generate Bill ) Assign fixed
	 * prices to food items When user enters 'Generate Bill' option(10) , display
	 * total bill & exit.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Dosa - 70 INR");
		System.out.println("2. Samosa - 20 INR");
		System.out.println("3. Paneer - 200 INR");
		System.out.println("4. Pizza - 200 INR");
		System.out.println("5. Noodles - 150 INR");
		System.out.println("6. Rice - 180 INR");
		System.out.println("7. Fried Rice - 220 INR");
		System.out.println("8. Tea - 30 INR");
		System.out.println("9. Black Coffee - 100 INR");
		System.out.println("10. Generate Bill");
		
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		do {
			if (sc.hasNextInt()) {
				switch (sc.nextInt()) {
					case 1: total += 70;
						break;
					case 2: total += 20;
					break;
					case 3: total += 200;
					break;
					case 4: total += 200;
					break;
					case 5: total += 150;
					break;
					case 6: total += 180;
					break;
					case 7: total += 220;
					break;
					case 8: total += 30;
					break;
					case 9: total += 100;
					break;
					case 10: 
						System.out.println("Total Bill is: INR " + total);
					break;
					default: System.out.println("Wrong Entry");
					break;
				}
			}
		} while (true);
		
	}

}
