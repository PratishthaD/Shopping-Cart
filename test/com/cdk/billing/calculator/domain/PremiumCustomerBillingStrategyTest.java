package com.cdk.billing.calculator.domain;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PremiumCustomerBillingStrategyTest {

	PremiumCustomerBillingStrategy premStrategy;

	@Before
	public void setUp() throws Exception {
		premStrategy = new PremiumCustomerBillingStrategy();
	}

	@Test
	public void testCalculateFinalBill() {
		assertTrue(premStrategy.calculateFinalBill(4000.0) == 3600.0);
		assertFalse(premStrategy.calculateFinalBill(15000.0) == 15000.0);
	}

}
