
public class RandomCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Generate a random character between 'a' & 'c' : " + getRandomCharacter('a' , 'c'));
		System.out.println("Generate a random lowercase letter : " + getRandomLowerCaseLetter());
		System.out.println("Generate a random uppercase letter : " + getRandomUpperCaseLetter());
		System.out.println("Generate a random digit character : " + getRandomDigitCharacter());
		System.out.println("Generate a random character : " + getRandomCharacter());

	}
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}
	
	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}
	
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}
	
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}
	
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}
	

}
