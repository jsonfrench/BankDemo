package edu.monmouth.s1338331.CS176.BankAccount;

public class BankAccountTester {

	public static void main(String[] args) {
		
		BankAccount fred = new BankAccount("fred");
		BankAccount macy = new BankAccount("macy", 1200);
		BankAccount walter = new BankAccount("walter", 737000);
		BankAccount bezos= new BankAccount ("bezos", 1000000000);
		
		System.out.printf("%s has $%.2f%n", fred.getOwner(), fred.getBalance());
		System.out.printf("%s has $%.2f%n", macy.getOwner(), macy.getBalance());
		System.out.printf("%s has $%.2f%n", walter.getOwner(), walter.getBalance());
		System.out.printf("%s has $%.2f%n", bezos.getOwner(), bezos.getBalance());

		fred.depositMoney(400);
		macy.depositMoney(1);
		walter.chargeFees();
		bezos.payInterest();
		
		System.out.printf("%s has $%.2f%n", fred.getOwner(), fred.getBalance());
		System.out.printf("%s has $%.2f%n", macy.getOwner(), macy.getBalance());
		System.out.printf("%s has $%.2f%n", walter.getOwner(), walter.getBalance());
		System.out.printf("%s has $%.2f%n", bezos.getOwner(), bezos.getBalance());
		

	}

}
