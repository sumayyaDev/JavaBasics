import java.util.Scanner;
public class digitOrCharacter {			// Quiz1_Task2

	public static void main(String[] args) {
		// Write a method that returns if a character is a digit or any other character.
		
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter a Character : ");
	        char ch = input.nextLine().toCharArray()[0];
	        //input.close();
	        boolean truthValue = isDigit(ch);
	        System.out.println(truthValue);
	}
	        public static boolean isDigit(char ch) {
	           
	            switch(ch){
	                
	                case 48:
	                    System.out.println(ch + " is a digit.");
	                    break;
	                case 49:
	                    System.out.println(ch + " is a digit.");
	                    break;
	                case 50:
	                    System.out.println(ch + " is a digit.");
	                    break;
	                case 51:
	                    System.out.println(ch + " is a digit.");
	                    break;
	                case 52:
	                    System.out.println(ch + " is a digit.");
	                    break;
	                case 53:
	                    System.out.println(ch + " is a digit.");
	                    break;
	                 case 54:
	                    System.out.println(ch + " is a digit.");
	                    break;
	                case 55:
	                    System.out.println(ch + " is a digit.");
	                    break;
	                 case 56:
	                    System.out.println(ch + " is a digit.");
	                    break;
	                case 57:
	                    System.out.println(ch + " is a digit.");
	                    break;
	                default:
	                    System.out.println(ch + " is not a digit.");
	                    
	            }
	            boolean check = Character.isDigit(ch);
	            return check; 
	        }     

	}


