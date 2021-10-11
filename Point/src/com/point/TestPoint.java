package com.point;

import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		
		//step-6
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x and y for point 1: ");
		int p1x = sc.nextInt();
		int p1y = sc.nextInt();
		Point2D p1 = new Point2D(p1x,p1y);
		//step-7
		System.out.println("P1 " + p1.getDetails());

		System.out.println("Enter x and y for point 2: ");
		int p2x = sc.nextInt();
		int p2y = sc.nextInt();
		Point2D p2 = new Point2D(p2x, p2y);
		//step-7
		System.out.println("P2 " + p2.getDetails());
		
		//step-8
		System.out.println("Are both points ? -> " + p1.isEqual(p2));
		
		//step-9
		Point2D p3 = p1.createPoint(p1x, p1y);
		
		//step-10
		System.out.println("Distance between p1 and p2 is: " + p1.calculateDistance(p2));
		System.out.println("Distance between p2 and p3 is: " + p2.calculateDistance(p3));
		System.out.println("Distance between p1 and p3 is: " + p1.calculateDistance(p3));
	}
}
