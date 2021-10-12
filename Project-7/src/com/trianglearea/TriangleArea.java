package com.trianglearea;

public class TriangleArea {

	public float TriangleArea(Point A, Point B, Point C) {
		float area = (A.x * (B.y - C.y) + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2.0f;
		return Math.abs(area);
	}

}
