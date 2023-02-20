package edu.monmouth.s1338331.CS176.BankAccount;

public class BankAccount {
	
	private double balance;
	private String owner;
	
	public BankAccount(String owner) {
		balance = 0;
		this.owner = owner;
	}

	public BankAccount(String owner, double startingAmt) {
		balance = startingAmt;
		this.owner = owner;
	}
	
	public void depositMoney(double amt) {
		balance += amt;
	}
	
	public void withdrawMoney(double amt) {
		balance -= amt;
	}
		
	public double getBalance() {
		return balance;
	}

	public String getOwner() {
		return owner;
	}
	
	
}
