
public class TestEdible {

	public static void main(String[] args) {
		
		Object[] object = {new Chicken(), new Tiger(), new Apple(), new Orange()};
		for(int i = 0; i < object.length; i++) {
			if(object[i] instanceof Animal)
				System.out.println(((Animal)object[i]).sound());
			
			if(object[i] instanceof Edible) {
				System.out.println(((Edible)object[i]).howToEat());
			}
		}

	}

}
