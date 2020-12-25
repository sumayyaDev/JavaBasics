package newboston44_Enumeration;
import java.util.EnumSet; // when working with EnumSet range we need to import this calss
public class objectEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(processEnum people: processEnum.values()) {
			System.out.printf("%s\t%s\t\t%s\n", people, people.getDesc(), people.getYear());
		}
		System.out.println("\nAnd now for the range of constants!!!\n");
		
		for(processEnum people: EnumSet.range(processEnum.asiya, processEnum.biba)) {
			System.out.printf("%s\t%s\t\t%s\n", people, people.getDesc(), people.getYear());
			
		}

	}

}
