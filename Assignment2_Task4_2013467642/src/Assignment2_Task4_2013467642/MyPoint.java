package Assignment2_Task4_2013467642;

public class MyPoint {
	
	public double x;
	public double y;
	
	public MyPoint() {
		this(0, 0);
	}
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double x() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double y() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double distance(double x, double y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	}
	public double distance(MyPoint point) {
		return distance(point.x, point.y);
	}
	
	
	
	/** Return true if this point is on the
     *  line segment from p0 to p1 */
    public boolean onTheLineSegment(MyPoint p0, MyPoint p1) {

        return onTheLineSegment(p0.x, p0.y, p1.x, p1.y, x, y);

    }
    /** Return true if point (x2, y2) is on the
     *  line segment from (x0, y0) to (x1, y1) */
    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {

        double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        return position <= 0.0000000001 && ((x0 <= x2 && x2 <= x1) || (x0 >= x2 && x2 >= x1));
    }
	
	
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
