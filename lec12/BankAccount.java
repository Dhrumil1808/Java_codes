package lec12;

public class BankAccount {
	int id=0;
	double balance=0;
	double annualInterestRate=0;
	
	public BankAccount()
	{
		
	}
	
	public BankAccount(int newId,double newBalance, double newInterestRate)
	{
		id=newId;
		balance=newBalance;
		annualInterestRate=newInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public String toString()
	{
		return "id: "+ id +" balance: " + balance + " interestrate :" + annualInterestRate;
	}

}
