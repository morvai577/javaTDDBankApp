package javaTDDBankApp;

public class BankAccount {

	private int balance;
	
	public int getBalance() {
		return this.balance;
	}

	public void deposit(int i) {
		// TODO Auto-generated method stub
		balance += i;
	}

}
