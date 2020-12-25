package Lab6_Task3;

public class Account {
	private int id;
	private double balance;
	private static double annualInterestRate = 0;
	private java.util.Date dateCreated;        // Date
	
	public Account() {
		id = 0;
		balance = 0;
		this.dateCreated = new java.util.Date(); //Date
	}
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new java.util.Date(); // Date
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return this.balance;
	}
	public static void setAnnualInterestRate(double AIR) {
		annualInterestRate = AIR;
	}
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public String getDateCreated() {
        return this.dateCreated.toString();
    }
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12*100;
	}
	public double getMonthlyInterest() {
		return (this.balance) * (this.getMonthlyInterestRate());
				}
	public void withdraw(double amount) {
		this.balance = this.balance - amount;
	}
	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}
}
