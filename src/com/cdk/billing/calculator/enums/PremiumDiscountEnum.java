package com.cdk.billing.calculator.enums;

/**
 * Enums to maintainDisocunts for Premium Customers
 * @author Pratishtha Dwivedi
 *
 */
public enum PremiumDiscountEnum {
	BELOW_FOUR_THOUSAND(0.10), BELOW_EIGHT_THOUSAND(0.15), BELOW_TWELVE_THOUSAND(0.20), ABOVE_TWELVE_THOUSAND(0.30);

	public double discount;

	private PremiumDiscountEnum(double discount) {
		this.setDiscount(discount);
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}