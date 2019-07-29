package com.cdk.billing.calculator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Shopping Bill Calculator
 * 
 * @author Pratishtha Dwivedi
 *
 */
public class BillingCalculatorFactoryTest {

	BillingCalculatorFactory factory;

	@Before
	public void setUp() throws Exception {
		factory = new BillingCalculatorFactory();
	}

	@Test
	public void testBillingCalulator() {
		assertTrue(factory.billingCalulator("RegularCustomer", 5000.00) == 5000.0);
		assertTrue(factory.billingCalulator("PremiumCustomer", 4000.00) == 3600.00);
		assertFalse(factory.billingCalulator("PremiumCustomer", 4000.00) == 4000.0);
	}

}
