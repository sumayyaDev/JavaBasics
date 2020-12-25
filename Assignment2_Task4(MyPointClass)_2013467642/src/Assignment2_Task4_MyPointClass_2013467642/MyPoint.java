package Assignment2_Task4_MyPointClass_2013467642;

public class MyPoint {
	public double x;
	public double y;
	
	public MyPoint(){
		this.x = 0;
		this.y = 0;
	}
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
    public void setX(double x) {
    	this.x = x;	
	}
    public double getY() {
    	return y;
    }
    public void setY(double y) {
    	this.y = y;
    }
    public double distance(double x, double y) {
    	return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }


}
