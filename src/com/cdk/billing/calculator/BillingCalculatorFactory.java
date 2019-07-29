package com.cdk.billing.calculator;

import com.cdk.billing.calculator.domain.PremiumCustomerBillingStrategy;
import com.cdk.billing.calculator.domain.RegularCustomerBillingStrategy;

/**
 * Shopping Bill Calculator
 * 
 * @author Pratishtha Dwivedi
 *
 */
public class BillingCalculatorFactory {

	private static final String REGULAR_CUSTOMER = "RegularCustomer";
	private static final String PREMIUM_CUSTOMER = "PremiumCustomer";

	BillingContext context;

	/**
	 * This method calculates final bill by applying discount based on customerType
	 * 
	 * @param customerType
	 * @param billAmt
	 * @return
	 */
	public double billingCalulator(String customerType, Double billAmt) {
		switch (customerType) {
		case REGULAR_CUSTOMER: {
			context = new BillingContext(new RegularCustomerBillingStrategy());
			return this.context.calculateFinalBill(billAmt);

		}
		case PREMIUM_CUSTOMER: {
			context = new BillingContext(new PremiumCustomerBillingStrategy());
			return this.context.calculateFinalBill(billAmt);
		}
		default:
			return 0.00;

		}

	}

}
