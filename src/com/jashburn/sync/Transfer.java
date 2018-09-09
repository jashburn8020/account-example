package com.jashburn.sync;

/**
 * Concrete command to transfer funds from one account to another.
 */
public class Transfer implements Payment {

	private static String TYPE = "Transfer";
	private Account fromAcct;
	private Account toAcct;
	private double amount;

	public Transfer(Account fromAcct, Account toAcct, double amount) {
		this.fromAcct = fromAcct;
		this.toAcct = toAcct;
		this.amount = amount;
	}

	@Override
	public void execute() {
		fromAcct.substract(amount);
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
