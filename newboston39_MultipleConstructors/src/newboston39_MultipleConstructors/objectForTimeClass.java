package newboston39_MultipleConstructors;

public class objectForTimeClass {

	public static void main(String[] args) {
		// Create object 
		TimeMulConst timeObject = new TimeMulConst();
		TimeMulConst timeObject2 = new TimeMulConst(5);
		TimeMulConst timeObject3 = new TimeMulConst(5,13);
		TimeMulConst timeObject4 = new TimeMulConst(5,13,43);
		
//		System.out.printf("%s\n", timeObject.toMilitary());
//		System.out.printf("%s\n", timeObject2.toMilitary());
//		System.out.printf("%s\n", timeObject3.toMilitary());
//		System.out.printf("%s\n", timeObject4.toMilitary());
		
		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject2.toMilitary());
		System.out.println(timeObject3.toMilitary());
		System.out.println(timeObject4.toMilitary());

	}

}
