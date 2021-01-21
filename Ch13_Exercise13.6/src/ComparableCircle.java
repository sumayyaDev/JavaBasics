
public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
	
	
	public ComparableCircle() {
		
	}
	public ComparableCircle(double radius) {
		super(radius);
	}
	
	
	
	public int compareTo(ComparableCircle o) {
		if(getArea() > o.getArea())
			return 1;
		else if(getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return "ComparableCircle [getArea()=" + getArea() + "]";
	}
}
