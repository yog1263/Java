/**
 * 
 */
package com.lq.exercises;

/**
 * @author developer
 *
 */
public class Lab3_ex_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=1;
		String[] monthNames = {"January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December"};
		while(i<=12)
		{
			
			switch(i) {
			
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: 
				System.out.println("There are 31 days in "+ monthNames[i-1]);
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("There are 30 days in " + monthNames[i-1]);
				break;
			case 2:
				System.out.println("There are 28 days in " + monthNames[i-1]);
				break;
			default:
				System.out.println("Invalid Month");
			
			}
			i++;
			
		}

	}

}
