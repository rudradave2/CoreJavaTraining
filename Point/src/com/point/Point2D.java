package com.point;


public class Point2D {
	
	private int x, y;
	
	public Point2D() {
		
	}
	
	public Point2D(int i, int j) {
		x = i;
		y = j;
	}
	
	public String getDetails() {
		return "Point ("+x+","+y+")";
	}
	
	public boolean isEqual(String p) {
		if (p.equals(getDetails())) {
			return true;
		}
		return false;
	}

}
