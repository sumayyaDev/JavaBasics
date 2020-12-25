package Assignment2_Task4_2013467642;
import java.awt.geom.Line2D;

public class Triangle2D {
	
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;
	
	public Triangle2D() {
		this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
	}
	public Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.p1 = new MyPoint(x1, y1);
		this.p2 = new MyPoint(x2, y2);
		this.p3 = new MyPoint(x3, y3);
		
	}
	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	
	public MyPoint getP1() {
		return p1;
	}
	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}
	public MyPoint getP2() {
		return p2;
	}
	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}
	public MyPoint getP3() {
		return p3;
	}
	public void setP3(MyPoint p3) {
		this.p3 = p3;
	}
	
	
	public double getPerimeter() {
		double s1 = p1.distance(p2);
		double s2 = p2.distance(p3);
		double s3 = p3.distance(p1);
		return s1+s2+s3;
	}
	public double getArea() {                      // getArea()
		double s1 = p1.distance(p2);
		double s2 = p2.distance(p3);
		double s3 = p3.distance(p1);
		double s = (s1+s2+s3) / 2.0;
		return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
	}
	
	// Returns true if the specified point is inside this triangle
	public boolean contains(MyPoint p) {
		return contains(p.x(), p.y());             
	}
	public boolean contains(double x, double y) {
		// Get MAX x & y
		double maxX = getMax(p1.x, p2.x, p3.x);
		double maxY = getMax(p1.y, p2.y, p3.y);
		// Get MIN x & y
		double minX = getMin(p1.x, p2.x, p3.x);
		double minY = getMin(p1.y, p2.y, p3.y);
		
		// Outside the bounding rectangle of the triangle
		if(x<minX || x>maxX || y<minY || y>maxY)
			return false;
		
		// Check if point is the border of the triangle
		MyPoint p = new MyPoint(x, y);
		boolean side1 = p.onTheLineSegment(p1 , p2);
		boolean side2 = p.onTheLineSegment(p1 , p3);
		boolean side3 = p.onTheLineSegment(p2 , p3);
		
		return side1 || side2 || side3;
	}
	
	private double getMax(double...n) {
		double max = n[0];
		for(int i = 1; i < n.length; i++) {
			if(max < n[i])
				max = n[i];
		}
		return max;
	}
	private double getMin(double...n) {
		double min = n[0];
		for(int i = 1; i < n.length; i++) {
			if(min > n[i])
				min = n[i];
		}
		return min;
	}
	 
	// Return true if point(x2, y2) is on the line segment ***from (x0, y0) to (x1, y1)
	public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
		
		double position = (x1-x0)*(y2-y0) - (x2-x0)*(y1-y0);
		return position<=0.0000000001 && ((x0<=x2 && x2<=x1) || (x0>=x2 && x2>=x1)); 
	}
	
	// Return true if the specified triangle is inside this triangle
	public boolean contains(Triangle2D t) {
		return contains(t.p1) && contains(t.p2) && contains(t.p3);
	}
	// Return true if the specified triangle overlaps with this triangle
	public boolean overlaps(Triangle2D t) {
		MyPoint[] pt1 = getTrianglePoints();            
		MyPoint[] pt2 = t.getTrianglePoints();
		
		// Check is triangle side intersect
		for(int i = 0; i < 3; i++) {
			int maxI = (i+1)%3;     // max index
			for(int j = 0; j < 3; j++) {
				int maxJ = (j+1)%3;
				
				Line2D line1 = new Line2D.Double(pt2[i].x, pt2[i].y, pt2[maxI].x, pt2[maxI].y);
				Line2D line2 = new Line2D.Double(pt1[i].x, pt1[i].y, pt1[maxJ].x, pt1[maxJ].y);
				if(line1.intersectsLine(line2)) {
					return true;
				}
			}
		}
		return false;
	}
	
	private MyPoint[] getTrianglePoints() {
		MyPoint[] points = new MyPoint[3];
		
		points[0] = p1;
		points[1] = p2;
		points[2] = p3;
		return points;
	}
	
	// Returns true if the triangle is valid
	public boolean isValid() {
		double s1 = p1.distance(p2);
		double s2 = p2.distance(p3);
		double s3 = p3.distance(p1);
		
		return ((s1+s2>s3) && (s1+s3>s2) && (s2+s3>s1));
	}
	
	public static double area(double side1, double side2, double side3) {

        double s = (side1 + side2 + side3) / 2.0;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
	 

}
