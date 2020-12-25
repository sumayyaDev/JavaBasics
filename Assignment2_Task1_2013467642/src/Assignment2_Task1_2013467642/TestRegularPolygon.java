package Assignment2_Task1_2013467642;

public class TestRegularPolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon polygonObject1 = new RegularPolygon();
		RegularPolygon polygonObject2 = new RegularPolygon(6, 4);
		RegularPolygon polygonObject3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("\nThe perimeter is: " + polygonObject2.getPerimeter() + " and the area is: " + polygonObject2.getArea());
		System.out.println("\nThe perimeter is: " + polygonObject3.getPerimeter() + " and the area is: " + polygonObject3.getArea());		

	}

}
