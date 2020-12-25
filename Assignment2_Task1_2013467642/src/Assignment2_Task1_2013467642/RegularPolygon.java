package Assignment2_Task1_2013467642;

public class RegularPolygon {
	private int n; // The number of sides
	private double side; // The length of the side
	private double x; // x-coordinate of the polygon's center 
	private double y; // y-coordinate of the polygon's center
	
	public RegularPolygon(){
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	
	public RegularPolygon(int n, double side){
		this.n = n;
		this.side = side;
		x=0;
		y=0;
	}
	
	public RegularPolygon(int n, double side, double x, double y){
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	public void setN(int n){
		this.n = n;
	}
	public int getN() {
		return n;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setX(double n) {
		this.x = n;
	}
	public double getX() {
		return x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getY() {
		return y;
	}
	
	public double getPerimeter() {
		double perimeter = n * side;
		return perimeter;
	}
	
	public double getArea() {
		
		double area = (n*side*side) / (4*Math.tan(Math.PI/n));
		return area;
	}
}
