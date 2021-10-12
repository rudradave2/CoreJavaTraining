package com.money;

public class MoneyManagement {
	private int income;
	
	public MoneyManagement(int income) {
		this.income = income;
	}

	public int calculateNEC() {
		return percentToAmount(55);
	}
	public int calculateFFA() {
		return percentToAmount(10);
	}
	public int calculateEDU() {
		return percentToAmount(10);
	}
	public int calculateLTSS() {
		return percentToAmount(10);
	}
	public int calculatePLAY() {
		return percentToAmount(10);
	}

	public int calculateGIVE() {
		return percentToAmount(5);
	}

	public int percentToAmount(int percent) {
		return (int) ((income*percent)/100);
	}
}
