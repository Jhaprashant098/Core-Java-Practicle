package Prashant.Core.Oop;

public class Account {
	private String number;
	private String accounttype;
	private double balance;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdrawal(double amount) {
		double bal = getBalance() - amount;
		setBalance(bal);
	}

	public void deposit(double dep) {
	double	bal2 = getBalance() + dep;
	setBalance(bal2);
	
	}

}
