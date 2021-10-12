package com.ipoperations;

import java.util.Scanner;

public class DataTypeValidation {
	
	/*
	 * 2. Accept 2 double values from User (using Scanner). Check data type. . If
	 * arguments are not doubles , supply suitable error message & terminate. If
	 * numbers are double values , print its average.(hasNextDouble()---boolean)--
	 * true sc.nextDouble
	 */
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two double values: ");
		if (sc.hasNextDouble()) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			System.out.println((a + b) / 2);
		}
		sc.close();
	}
	
}
