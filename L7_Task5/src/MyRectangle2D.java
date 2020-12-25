
public class MyRectangle2D {
	
	private double x;
	private double y;
	private double width;
	private double height;
	
	public MyRectangle2D() {
		x = 0;
		y = 0;
		width = 1;
		height = 1;
	}
	public MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
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
	public void setY(double x) {
		 this.y = y;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		 this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		 this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	public double getPerimeter() {
		return 2 * (width * height);
	}
	
	// Is the point (x, y)[passed from main class] inside this.rectangle
	public boolean contains(double x, double y) {
		
		return Math.abs(x-this.x) <= (width/2) && Math.abs(y-this.y) <= (height/2); 
	}
	
	// Is the new/specified rectangle inside this.rectangle
    public boolean contains(MyRectangle2D r) {
    	
    	return contains(r.x-r.width/2, r.y+r.height/2) &&
    	       contains(r.x+r.width/2, r.y+r.height/2) &&
    	       contains(r.x+r.width/2, r.y-r.height/2);
	}
    
    // Is the new/specified rectangle overlaps this.rectangle
    public boolean overlaps(MyRectangle2D r) {
    	
    	return Math.abs(r.x-x) <= (r.width + width/2) && Math.abs(r.y-y) <= (r.height + height/2); 
		
	}	
}
