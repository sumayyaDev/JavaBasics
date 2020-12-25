
public class Cat extends Pet{
	
	String coatColor;
	
	public Cat() {
		
	}
    public Cat(Pet pObj) {
		
	}
	
	public String getCoatColor() {
		return coatColor;
	}
	public void setCoatColor() {
		this.coatColor = coatColor;
	}
	
    public String toString() {
    	System.out.println( pObj.getName() + pObj.getType()+ catObj.getCoatColor());
	}

}
