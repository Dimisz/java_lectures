package com.uningen.calculators;

public class ScientificCalculator {
	
	
	public static final double PI = 3.14159;
	private double holdValue;
	
	public static final double exp(double x) {
		return Math.pow(Math.E, x);
	}
	
	public static final double log(double x) {
		return Math.log(x);
	}
	
	public final void putValueInMemory(double x) {
		this.holdValue = x;
	}
	
	public final double getValueFromMemory() {
		return this.holdValue;
	}
}
