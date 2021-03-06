
public class Decagon {
	
	private float side;
	private RGB color;
	
	private java.util.Date createdOn;
	
	public Decagon(float side, RGB color) {
		this.side = side;
		this.color = color;
		createdOn = new java.util.Date();
	}
	
	public float getArea() {
		return (float)((5/2.0) * side * side * Math.sqrt(5+2*Math.sqrt(5)));
	}
	public float getLengthOfSide() {
		return this.side;
	}
	public RGB getColor() {
		return this.color;
	}
	
	
	public void setColor(RGB color) {
		this.color = color;
	}
	public void setSide(float side) {
		this.side = side;
	}
	
	//this= the object of present class
	
	public int compareArea(Decagon anotherDecagon) {
		
		if(getArea() > anotherDecagon.getArea())
			return 1;
		else if(getArea() < anotherDecagon.getArea())
			return -1;
		else                 
			return 0;
	}
	
	public java.util.Date getDateCreated(){
		return createdOn;
	}
	
//	Length of side: <side> units,
//	Created On: <createdOn>,
//	Color: [R = <red>, G = <green>, B = <blue>].
	public String toString() {
		return String.format("Length of side: <" + getLengthOfSide() + "> units,\nCreated On: <" + getDateCreated() + ">,");
	}
	
	

}
