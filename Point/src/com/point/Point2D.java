package com.point;


public class Point2D {
	
	private int x, y;
	
	public Point2D(int x, int y) {
		this.x = x;
        this.y = y;
	}
	
	public Point2D createPoint(int x, int y) {
		Point2D p = new Point2D(x, y);
		return p;
	}
	
    public double calculateDistance (Point2D that) {
        double dx = this.x - that.x;
        double dy = this.y - that.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public boolean isEqual(Point2D that) {
    	if (this.getDetails().equals(that.getDetails())) {
			return true;
		}
		return false;
    }

	public String getDetails() {
		return "Point ("+x+","+y+")";
	}

}
