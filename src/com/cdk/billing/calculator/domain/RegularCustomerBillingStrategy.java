package com.cdk.billing.calculator.domain;

import com.cdk.billing.calculator.enums.RegularDiscountEnum;

public class RegularCustomerBillingStrategy extends BillingStrategy {
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cdk.billing.calculator.domain.CustomerBillingStrategy#calculateFinalBill(
	 * double)
	 */
	@Override
	public double calculateFinalBill(double actualBillAmt) {

		double finalBillAmt;

		if (actualBillAmt <= 5000) {
			finalBillAmt = actualBillAmt - getDiscountedAmount(actualBillAmt, RegularDiscountEnum.BELOW_FIVE_THOUSAND.discount);
		} else if (actualBillAmt > 5000 && actualBillAmt <= 10000) {
			finalBillAmt = actualBillAmt - getDiscountedAmount(actualBillAmt - 5000, RegularDiscountEnum.BELOW_TEN_THOUSAND.discount)
					- getDiscountedAmount(5000, RegularDiscountEnum.BELOW_FIVE_THOUSAND.discount);
		} else {
			finalBillAmt = actualBillAmt - getDiscountedAmount(actualBillAmt - 10000, RegularDiscountEnum.ABOVE_TEN_THOUSAND.discount)
					- getDiscountedAmount(5000, RegularDiscountEnum.BELOW_TEN_THOUSAND.discount)
					- getDiscountedAmount(5000, RegularDiscountEnum.BELOW_FIVE_THOUSAND.discount);
		}
		return finalBillAmt;

	}
	
}
