package com.money;

import java.util.Scanner;

public class TestMoney {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you income this month: ");
		int income = sc.nextInt();
		
		MoneyManagement mm = new MoneyManagement(income);

		System.out.println("Here’s how you should manage your money: ");
		System.out.println();
		
		System.out.println("NEC: " + mm.calculateNEC() + "     LTSS: " +  mm.calculateLTSS());
		System.out.println();
		System.out.println("FFA: " + mm.calculateFFA() + "     PLAY: " +  mm.calculatePLAY() );
		System.out.println();
		System.out.println("EDU: " + mm.calculateEDU() + "     GIVE: " +  mm.calculateGIVE() );
		
		sc.close();
	}

}
