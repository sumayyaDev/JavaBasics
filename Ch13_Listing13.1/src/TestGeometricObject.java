
public class TestGeometricObject {

	public static void main(String[] args) {
		
		//Creates two geometric object
		GeometricObject geoObject1 = new Circle(5);
		GeometricObject geoObject2 = new Rectangle(5, 3);
		
		System.out.println("The two objects have the same area? " + equalArea(geoObject1, geoObject2));
		
		// Display Circle
		displayGeometricObject(geoObject1);
		//Display Rectangle
		displayGeometricObject(geoObject2);
	}
	//A method for comparing the areas of two geometric objects, It has been possible for abtract method that define in GeometricObject Class
	public static boolean equalArea(GeometricObject geoObject1, GeometricObject geoObject2) {
		return geoObject1.getArea() == geoObject2.getArea();
	}
	//A method for displaying a geometricObject
	public static void displayGeometricObject(GeometricObject geoObject) {
		System.out.println();
		System.out.println("The area is " + geoObject.getArea());
		System.out.println("The perimeter is " + geoObject.getPerimeter());
	}

}
