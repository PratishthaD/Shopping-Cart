package com.cdk.billing.calculator.enums;

/**
 * Enums to maintainDisocunts for Regular Customers
 * 
 * @author Pratishtha Dwivedi
 *
 */
public enum RegularDiscountEnum {
	BELOW_FIVE_THOUSAND(0.00), BELOW_TEN_THOUSAND(0.1), ABOVE_TEN_THOUSAND(0.2);

	public double discount;

	private RegularDiscountEnum(double discount) {
		this.discount = discount;
	}

}