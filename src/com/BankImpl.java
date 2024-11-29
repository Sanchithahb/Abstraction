package com;

 class BankImpl implements Bank {
	int balance = 5000;
	
	public void deposit(int amount) {
		System.out.println("depositing ₹"+amount);
		balance = balance + amount;
		System.out.println("depositing successfully");
		
	}
	public void withdraw(int amount) {
		System.out.println("withdrawing ₹"+amount);
		balance = balance - amount;
		System.out.println("withdrawing successfully");
		
	}
	public void checkBalance() {
		System.out.println("available balance: ₹"+balance);
		
		
	}

}
