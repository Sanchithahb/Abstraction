package com;

public class BnakMainclass {
	public static void main(String[] args) {
		Bank b = new BankImpl();
		b.checkBalance();

		System.out.println("=-------------");

		b.deposit(2000);

		System.out.println("---------------");

		b.withdraw(1000);
		b.checkBalance();
	}

}
