package com.cdk.billing.calculator.domain;

public abstract class BillingStrategy {
	/**
	 * 
	 * @param actualBill
	 * @return
	 */
	public abstract double calculateFinalBill(double actualBill) ;
	
	/**
	 * 
	 * @param amt
	 * @param discount
	 * @return
	 */
	public double getDiscountedAmount(double amt, double discount) {
		return amt * discount;
	}

}
