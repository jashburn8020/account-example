package com.jashburn.sync;

/**
 * Generic payment command.
 */
public interface Payment {

	public void execute();

	public String getType();

	public double getAmount();
}
