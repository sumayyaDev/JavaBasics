import java.util.ArrayList;
public class TestArrayList {

	public static void main(String[] args) {
		// Create a list to store cities
		ArrayList<String> cityList = new ArrayList<>();
		
		// Add some cities in the list
		cityList.add("London");
		cityList.add("Denvar");
		cityList.add("Paris");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		System.out.println(cityList);
		System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
		System.out.println("The location of Denvar in the list? " + cityList.indexOf("Denvar"));
		System.out.println("Is the list is empty? " + cityList.isEmpty());
		cityList.add(2, "Xian");
		cityList.remove("Miami");
		cityList.remove(1);
		System.out.println(cityList.toString());
		
		//Display the contents in the list in reverse order
		for(int i = cityList.size()-1; i >= 0; i--) {
			System.out.print(cityList.get(i) + " ");
		}
		System.out.println();
		
		//Create a list to store two circles
		ArrayList<CircleFromGeometricObject> list = new ArrayList<>();
		//Add two circles
		list.add(new CircleFromGeometricObject(2));
		list.add(new CircleFromGeometricObject(3));
		
		System.out.println("The area indexOf 0 circle? " + list.get(0).getArea());
		System.out.println("The area indexOf 1 circle? " + list.get(1).getArea());
	}

}
