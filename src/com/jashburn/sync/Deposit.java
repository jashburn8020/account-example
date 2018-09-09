package com.jashburn.sync;

/**
 * Concrete command to deposit funds into an account.
 */
public class Deposit implements Payment {

	private static final String TYPE = "Deposit";
	private Account toAcct;
	private double amount;

	public Deposit(Account to, double amount) {
		this.toAcct = to;
		this.amount = amount;
	}

	@Override
	public void execute() {
		toAcct.add(amount);
	}

	@Override
	public String getType() {
		return TYPE;
	}

	@Override
	public double getAmount() {
		return amount;
	}

}
