package com.cdk.billing.calculator.domain;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RegularCustomerBillingStrategyTest{

	RegularCustomerBillingStrategy regStrategy ;
	
	@Before
	public void setUp() throws Exception {
		regStrategy = new RegularCustomerBillingStrategy();
	}
	
	
	@Test
	public void testCalculateFinalBill() {
		assertTrue(regStrategy.calculateFinalBill(5000.0) == 5000.0);
		assertFalse(regStrategy.calculateFinalBill(15000.0) == 15000.0);
	}
	
	@Test
	public void testGetDiscountedAmount() {
		assertTrue(regStrategy.getDiscountedAmount(5000.0 ,0.1) == 500.0);	
	}
	
	
}
