package com.jashburn.sync;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class WithdrawTest {

	private Recorder recorder;
	private Account acct;

	@Before
	public void setUp() throws Exception {
		acct = new Account();
		recorder = new ConsoleRecorder();
	}

	@Test
	public void testExecute() {
		acct.add(50.0);
		Withdraw withdrawCmd = new Withdraw(acct, 30.0);
		assertEquals(50.0, acct.getBalance(), 0.0);

		withdrawCmd.execute();
		assertEquals(20.0, acct.getBalance(), 0.0);
		recorder.record(withdrawCmd, acct, null);
	}
}
