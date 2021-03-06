import java.util.Scanner;
public class TestAnimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Pet[] petArray = new Pet[50];
		
		for(int i = 0; i < petArray.length; i++) {
			System.out.print("Enter the name of the pet: ");
			String name = input.next();
			System.out.print("Type 'c' for cat and 'd' for dog: ");
			char type = input.next().charAt(0);
			
			petArray[i] = new Pet(name, type);
			
			if(type == 'c') {
				System.out.print("Input coat color: ");
				String coatColor = input.next();
				cat.setCoatColor(coatColor);
				System.out.println("Cat " + petArray[i].toString() + "\t" + cat.toString() + ".\n");
			}
			else if(type == 'd') {
				System.out.print("Input weight: ");
				double weight = input.nextDouble();
				dog.setWeight(weight);
				System.out.println("Dog " + petArray[i].toString() + "\t" + dog.toString() + ".\n");
			}
			else {
				System.out.println("Invalid input for type(You needed to typr 'c' for cat & 'd' for dog)");
			}
		}

	}

}
