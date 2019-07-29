package com.cdk.billing;

import com.cdk.billing.calculator.BillingCalculatorFactory;

/**
 * 
 * @author Pratishtha Dwivedi
 *
 */
public class BillingCalculator {

	private static final String REGULAR_CUSTOMER = "RegularCustomer";
	private static final String PREMIUM_CUSTOMER = "PremiumCustomer";

	BillingCalculatorFactory calculatorFactory = new BillingCalculatorFactory();

	/**
	 * 
	 * @param customerType
	 * @param initialBillAmt
	 * @return
	 */
	public double billCalculator(String customerType, double initialBillAmt) {
		return calculatorFactory.billingCalulator(customerType, initialBillAmt);
	}

	public static void main(String args[]) {
		BillingCalculator calculator = new BillingCalculator();
		System.out.println(calculator.billCalculator(REGULAR_CUSTOMER, 5000));
		System.out.println(calculator.billCalculator(PREMIUM_CUSTOMER, 4000));
		System.out.println(calculator.billCalculator(REGULAR_CUSTOMER, 10000));
		System.out.println(calculator.billCalculator(PREMIUM_CUSTOMER, 8000));
		System.out.println(calculator.billCalculator(REGULAR_CUSTOMER, 15000));
		System.out.println(calculator.billCalculator(PREMIUM_CUSTOMER, 12000));
		System.out.println(calculator.billCalculator(PREMIUM_CUSTOMER, 20000));

	}

}
