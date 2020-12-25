
public class Dog extends Pet {
	
	double weight;
	
	public Dog() {
		
	}
    public Dog(Pet pObj) {
		
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String toString() {
		System.out.println(pObj.getName()+" "+pObj.getType()+" " + dogObj.getWeight());
		
	}

}
