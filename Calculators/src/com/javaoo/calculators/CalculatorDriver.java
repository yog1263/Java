/**
 * 
 */
package com.javaoo.calculators;

/**
 * @author developer
 *
 */
public class CalculatorDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicCalculator bc = new BasicCalculator();
		System.out.println("7 + 5 =" + bc.add(7, 5));
		System.out.println("7 + 5 =" + bc.add(7, 5));
		System.out.println("7 + 5 =" + bc.add(7, 5));
		System.out.println("7 + 5 =" + bc.add(7, 5));
		
		ScientificCalculator sc = new ScientificCalculator();
		System.out.println("Exponent of 20="+ sc.exp(20));
		System.out.println("Log of 100=" + sc.log(100));
		sc.putValueInMemory(23.5);
		System.out.println("Value in memory is= " + sc.getValueFromMemory());
		
		TrignometricCalculator tc = new TrignometricCalculator();
		System.out.println("sin of .523 is " + tc.sine(.523));

	}

}
