package com.jashburn.sync;

/**
 * Concrete command to withdraw funds from an account.
 */
public class Withdraw implements Payment {

	private static final String TYPE = "Withdrawal";
	private Account fromAcct;
	private double amount;

	public Withdraw(Account fromAcct, double amount) {
		this.fromAcct = fromAcct;
		this.amount = amount;
	}

	@Override
	public void execute() {
		fromAcct.substract(amount);
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
