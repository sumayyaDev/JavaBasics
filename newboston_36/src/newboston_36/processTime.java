package newboston_36;

class processTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		time timeObject = new time();
		System.out.println("(By default) " + timeObject.toMilitary());
		System.out.println("(By default) " + timeObject.toRegularTime());
		
		timeObject.setTime(13, 27, 6);
		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject.toRegularTime());

	}

}
