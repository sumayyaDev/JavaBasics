
public class Dog extends Pet{
	
	double weight;
	
	public Dog() {
		
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return String.format("Dog weight = " + weight);
	}

}
