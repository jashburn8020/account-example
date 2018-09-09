package com.jashburn.sync;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Receiver of a Payment command.
 */
public class Account {

	private static AtomicLong idGenerator = new AtomicLong();

	private long id;

	private double balance;

	Account() {
		id = idGenerator.incrementAndGet();
	}

	double getBalance() {
		return balance;
	}

	double add(double amount) {
		return balance += amount;
	}

	double substract(double amount) {
		if (amount > balance) {
			throw new RuntimeException("Insufficient funds");
		}

		return balance -= amount;
	}

	long getId() {
		return id;
	}
}
