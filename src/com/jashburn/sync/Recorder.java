package com.jashburn.sync;

/**
 * Generic recorder of payments.
 */
public interface Recorder {
	public void record(Payment payment, Account fromAcct, Account toAcct);
}
