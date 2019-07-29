package com.cdk.billing.calculator.domain;

import com.cdk.billing.calculator.enums.PremiumDiscountEnum;
public class PremiumCustomerBillingStrategy extends BillingStrategy {

	/*
	 * (non-Javadoc)
	 * @see com.cdk.billing.calculator.domain.CustomerBillingStrategy#calculateFinalBill(double)
	 */
	@Override
	public double calculateFinalBill(double actualBillAmt) {

		double finalBillAmt;

		if (actualBillAmt <= 4000) {
			finalBillAmt = actualBillAmt - getDiscountedAmount(actualBillAmt, PremiumDiscountEnum.BELOW_FOUR_THOUSAND.discount);
		} else if (actualBillAmt > 4000 && actualBillAmt <= 8000) {
			finalBillAmt = actualBillAmt - getDiscountedAmount(actualBillAmt - 4000, PremiumDiscountEnum.BELOW_EIGHT_THOUSAND.discount)
					- getDiscountedAmount(4000, PremiumDiscountEnum.BELOW_FOUR_THOUSAND.discount);
		} else if (actualBillAmt > 8000 && actualBillAmt <= 12000) {
			finalBillAmt = actualBillAmt - getDiscountedAmount(actualBillAmt - 8000, PremiumDiscountEnum.BELOW_TWELVE_THOUSAND.discount)
					- getDiscountedAmount(4000, PremiumDiscountEnum.BELOW_EIGHT_THOUSAND.discount)
					- getDiscountedAmount(4000, PremiumDiscountEnum.BELOW_FOUR_THOUSAND.discount);
		} else {
			finalBillAmt = actualBillAmt - getDiscountedAmount(actualBillAmt - 12000, PremiumDiscountEnum.ABOVE_TWELVE_THOUSAND.discount)
					- getDiscountedAmount(4000, PremiumDiscountEnum.BELOW_TWELVE_THOUSAND.discount)
					- getDiscountedAmount(4000, PremiumDiscountEnum.BELOW_EIGHT_THOUSAND.discount)
					- getDiscountedAmount(4000, PremiumDiscountEnum.BELOW_FOUR_THOUSAND.discount);
		}
		return finalBillAmt;

	}

	

}
