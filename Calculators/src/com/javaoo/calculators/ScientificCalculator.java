/**
 * 
 */
package com.javaoo.calculators;

/**
 * @author developer
 *
 */
public class ScientificCalculator {

	/**
	 * @param args
	 */
	public final double pi=3.14159;
	private double holdValue;
	
	public final double exp(double x) {
		return (Math.exp(x));
	}
	
	public final double log(double x) {
		return (Math.log(x));
	}
	
	
	public final void putValueInMemory(double x) {
		holdValue = x;
	}
	
	public final double getValueFromMemory() {
		return holdValue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
