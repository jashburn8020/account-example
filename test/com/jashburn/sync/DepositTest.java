package com.jashburn.sync;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DepositTest {

	private Account toAcct;
	private Recorder recorder;

	@Before
	public void setUp() throws Exception {
		toAcct = new Account();
		recorder = new ConsoleRecorder();
	}

	@Test
	public void testExecute() {
		Payment depositCmd = new Deposit(toAcct, 50.0);
		assertEquals(0.0, toAcct.getBalance(), 0.0);

		depositCmd.execute();
		assertEquals(50.0, toAcct.getBalance(), 0.0);
		recorder.record(depositCmd, null, toAcct);
	}
}
