package com.jashburn.sync;

public class ConsoleRecorder implements Recorder {

	@Override
	public void record(Payment payment, Account fromAcct, Account toAcct) {
		System.out.println("Payment type: " + payment.getType());
		System.out.println("Amount: " + payment.getAmount());
		System.out.println("From account: " + (fromAcct == null ? "External" : fromAcct.getId()));
		System.out.println("From account balance: " + (fromAcct == null ? "N/A" : fromAcct.getBalance()));
		System.out.println("To account: " + (toAcct == null ? "External" : toAcct.getId()));
		System.out.println("To account balance: " + (toAcct == null ? "N/A" : toAcct.getBalance()));
		System.out.println("---");
	}
}
