package com.point;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Point2D p1 = new Point2D(a,b);
		System.out.println("P1" + p1.getDetails());

		Point2D p2 = new Point2D(10, 20);
		System.out.println("P2" +p2.getDetails());
		
//		System.out.println(p1.getDetails().isEqual(p2.getDetails()));
	}

}
