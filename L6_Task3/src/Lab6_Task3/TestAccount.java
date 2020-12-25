package Lab6_Task3;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myAccount = new Account(1122, 20000);
		Account.setAnnualInterestRate(4.5);
		myAccount.withdraw(2500);
		myAccount.deposit(3000);
		System.out.println("Balance = " + myAccount.getBalance());
		System.out.println("Monthly Interest = " + myAccount.getMonthlyInterest());
		System.out.println("Date created = " + myAccount.getDateCreated());

	}

}
