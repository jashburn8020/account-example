package com.jashburn.sync;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	private Account acct;

	@Before
	public void setUp() throws Exception {
		acct = new Account();
	}

	@Test
	public void testGetBalance() {
		acct.add(6.0);
		acct.substract(2.0);
		assertEquals(4.0, acct.getBalance(), 0.0);
	}

	@Test
	public void testAdd() {
		assertEquals(3.0, acct.add(3.0), 0.0);
		assertEquals(7.0, acct.add(4.0), 0.0);
	}

	@Test
	public void testSubstract() {
		acct.add(13.0);
		assertEquals(8.0, acct.substract(5.0), 0.0);
		assertEquals(4.0, acct.substract(4.0), 0.0);
	}

	@Test(expected = RuntimeException.class)
	public void testSubstractExceedBalance() {
		acct.add(1.0);
		acct.substract(1.1);
	}
}
