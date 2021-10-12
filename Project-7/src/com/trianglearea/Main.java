package com.trianglearea;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter x and y for point-1: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter x and y for point-2: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		System.out.println("Enter x and y for point-3: ");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		
		Point p1 = new Point(x1,y1);
		Point p2 = new Point(x2,y2);
		Point p3 = new Point(x3,y3);
		
		TriangleArea area = new TriangleArea();
		System.out.println("Area of the triangle is: " + area.TriangleArea(p1, p2, p3));
		sc.close();
		
	}

}
