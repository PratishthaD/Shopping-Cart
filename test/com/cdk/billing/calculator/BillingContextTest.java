package com.cdk.billing.calculator;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.cdk.billing.calculator.domain.PremiumCustomerBillingStrategy;
import com.cdk.billing.calculator.domain.RegularCustomerBillingStrategy;

/**
 * 
 * @author Pratishtha Dwivedi
 *
 */
public class BillingContextTest {

	private BillingContext regStrategy;
	private BillingContext premStrategy;

	@Before
	public void setUp() throws Exception {
		regStrategy = new BillingContext(new RegularCustomerBillingStrategy());
		premStrategy = new BillingContext(new PremiumCustomerBillingStrategy());
	}

	@Test
	public void testCalculateFinalBill() {
		assertTrue(regStrategy.calculateFinalBill(5000.00) == 5000.00);
		assertTrue(premStrategy.calculateFinalBill(4000.00) == 3600.00);
	}

}
