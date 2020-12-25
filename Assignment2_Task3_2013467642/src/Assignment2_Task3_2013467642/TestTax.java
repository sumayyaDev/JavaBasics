package Assignment2_Task3_2013467642;

public class TestTax {

	public static void main(String[] args) {
		// Create two tax objects one for 2009 & another for 2001
		Tax tax2001 = new Tax();
		Tax tax2009 = new Tax();
		
		// Tax rates for 2009
		double[] rates2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		tax2009.setRates(rates2009);
		
		// The 2001 brackets for each rate for all the filling status
		int[][] brackets2009 = {
				{8350, 33950, 82250, 171550, 372950},    // Single Filler
				{16700, 67900, 137050, 208850, 372950},  // Married jointly or qualifying widow(er)
				{8350, 33950, 68525, 104425, 186475},    // Married filing separately
				{11950, 45500, 117450, 190200, 372950}   // Head of household
	           };
		tax2009.setBrackets(brackets2009);
		
		
		// Tax rates for 2001
		double[] rates2001 = {0.15, 0.275, 0.305, 0.355, 0.391};
		tax2001.setRates(rates2001);
				
		// The 2001 brackets for each rate for all the filling status
		int[][] brackets2001 = {
				{27050, 65550, 136750, 297350}, // Single Filler
				{45200, 109250, 166500, 297350},// Married jointly or qualifying widow(er)
				{22600, 54625, 83250, 148675},  // Married filing separately
				{36250, 93650, 151650, 297350}  // Head of household
		       };
		tax2001.setBrackets(brackets2001);
		
		String s1 ="Taxable Income";
		String s2 ="Single Filler";
		String s3 ="Married jointly";
		String s4 ="Married filing separately";
		String s5 ="Head of household";
		
		// Table for the year 2009
		System.out.println("\nThe taxable incomes from $50,000 to $60,000 with interval of $1000");
		System.out.println("for the year 2009 are given in Table:");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.printf("%-20s%-18s%-18s%-30s%-20s\n", s1, s2, s3, s4, s5);
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		for(int i =50000; i <= 60000; i += 1000) {
			System.out.printf("%-20s%-18s%-18s%-30s%-20s\n", i,
					new Tax(Tax.SINGLE_FILER, brackets2009, rates2009, i).getTax(),
					new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER, brackets2009, rates2009, i).getTax(),
					new Tax(Tax.MARRIED_SEPARATELY, brackets2009, rates2009, i).getTax(),
					new Tax(Tax.HEAD_OF_HOUSEHOLD, brackets2009, rates2009, i).getTax()
					);
			System.out.println("-------------------------------------------------------------------------------------------------------------");
		}
		System.out.println("\n\n");
		
		// Table for the year 2001
		System.out.println("The taxable incomes from $50,000 to $60,000 with interval of $1000");
		System.out.println("for the year 2001 are given in Table:");
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.printf("%-20s%-18s%-18s%-30s%-20s\n", s1, s2, s3, s4, s5);
		System.out.println("------------------------------------------------------------------------------------------------------------");
		for(int i =50000; i <= 60000; i += 1000) {
			System.out.printf("%-20s%-18s%-18s%-30s%-20s\n", i,
					new Tax(Tax.SINGLE_FILER, brackets2001, rates2001, i).getTax(),
					new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER, brackets2001, rates2001, i).getTax(),
					new Tax(Tax.MARRIED_SEPARATELY, brackets2001, rates2001, i).getTax(),
					new Tax(Tax.HEAD_OF_HOUSEHOLD, brackets2001, rates2001, i).getTax()
					);
			System.out.println("---------------------------------------------------------------------------------------------------------");
		}
	}

}
