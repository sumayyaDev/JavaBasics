
public class L3_Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fee = 10_000;
		double year = 1;
		double taotalFee;
		double rate = 5;
		double tatalFee = 15000 + 15500 + 16000 + 16500;

		System.out.println("Year   "  + " Total Fee  ");
		System.out.println();

		while (year <= 10) {
		    taotalFee = fee + ((fee * ((year * rate) - rate)) / 100);
		    System.out.println(year + "  " + "       "+ taotalFee); 
		    year++;
		}

		System.out.println("Total cost tuition of 4 years starting 10 years from now is " + tatalFee);

	}

}
