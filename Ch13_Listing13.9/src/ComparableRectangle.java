
public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle>{
	
	//Construct a ComparableRectangle with specified properties
	public ComparableRectangle(double width, double height) {
		super(width, height);
	}
	
	//Implement the compareTo method defined in Comparable
	public int compareTo(ComparableRectangle object) {
		if(getArea() > object.getArea())
			return 1;
		else if(getArea() < object.getArea())
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return super.toString() + ", Area: " + getArea();
	}
	

}
