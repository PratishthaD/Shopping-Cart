package com.cdk.billing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BillingCalculatorTest {

	BillingCalculator calculator;

	@Before
	public void setUp() throws Exception {
		calculator = new BillingCalculator();
	}
	
	@Test
	public void testBillCalculator() {
		assertTrue(calculator.billCalculator("RegularCustomer", 5000.0) == 5000.0);
		assertTrue(calculator.billCalculator("PremiumCustomer", 4000.0) == 3600.0);
		assertTrue(calculator.billCalculator("RegularCustomer", 10000.0) == 9500.0);
		assertTrue(calculator.billCalculator("PremiumCustomer", 8000.0) == 7000.0);
		assertTrue(calculator.billCalculator("RegularCustomer", 15000.0) == 13500.0);
		assertTrue(calculator.billCalculator("PremiumCustomer", 12000.0) == 10200.0);
		assertTrue(calculator.billCalculator("PremiumCustomer", 20000.0) == 15800.0);

		// Negative Test case
		assertFalse(calculator.billCalculator("PremiumCustomer", 4000.0) == 4000.0);
		assertFalse(calculator.billCalculator("RegularCustomer", 15000.0) == 14500.0);
		// Not Null
		assertNotNull(calculator.billCalculator("PremiumCustomer", 4000.0));
	}

}
