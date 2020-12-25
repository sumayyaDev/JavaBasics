
public class apples {

	public static void main(String[] args) {
		
		// Destination: Making list of Dog and Fish Objects
		Animal[] theList = new Animal[2];
		
		Dog dogObject = new Dog();
		Fish fishObject = new Fish();
		
		theList[0] = dogObject;
		theList[1] = fishObject;
		
		for(Animal x: theList) {
			x.noise();
		}

	}

}
 