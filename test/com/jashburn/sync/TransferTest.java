package com.jashburn.sync;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TransferTest {

	private Recorder recorder;
	private Account fromAcct;
	private Account toAcct;

	@Before
	public void setUp() throws Exception {
		fromAcct = new Account();
		toAcct = new Account();
		recorder = new ConsoleRecorder();
	}

	@Test
	public void testExecute() {
		fromAcct.add(70.0);
		toAcct.add(10.0);

		Payment transferCmd = new Transfer(fromAcct, toAcct, 15.0);
		transferCmd.execute();
		assertEquals(55.0, fromAcct.getBalance(), 0.0);
		assertEquals(25.0, toAcct.getBalance(), 0.0);

		recorder.record(transferCmd, fromAcct, toAcct);
	}

}
