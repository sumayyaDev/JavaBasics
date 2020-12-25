
public class Cat extends Pet {
	
	String coatColor;
	
	public Cat() {
		
	}
	
	public String getCoatColor() {
		return coatColor;
	}
	public void setCoatColor(String coatColor) {
		this.coatColor = coatColor;
	}
	
	public String toString() {
		return String.format("Cat coat color = " + coatColor);
	}
	
}
