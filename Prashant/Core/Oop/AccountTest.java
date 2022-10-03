package Prashant.Core.Oop;

public class AccountTest {
	public static void main(String[] args) {
		Account arr = new Account();
		arr.setNumber("00325478994");
		arr.setAccounttype("Current account");
		arr.setBalance(15000);
		arr.deposit(5000);
		arr.withdrawal(1000);
		

		System.out.println(arr.getBalance());
		System.out.println(arr.getAccounttype());
	}

}