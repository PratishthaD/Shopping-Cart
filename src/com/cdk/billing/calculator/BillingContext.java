package com.cdk.billing.calculator;

import com.cdk.billing.calculator.domain.BillingStrategy;

/**
 * 
 * @author Pratishtha Dwivedi
 *
 */
public class BillingContext {
	
	private BillingStrategy strategy;
	
	public BillingContext(BillingStrategy strategy) {
		this.strategy = strategy;
	}
	
	public double calculateFinalBill(double actualBill) {
		return this.strategy.calculateFinalBill(actualBill);
	}

}
