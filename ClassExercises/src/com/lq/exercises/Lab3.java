/**
 * 
 */
package com.lq.exercises;

/**
 * @author developer
 *
 */
public class Lab3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] daysofWeek = {"Sunday", "Monday", "Tuesday", "Thursday",
				"wednesday", "Friday", "Saturday"};
		int count_daysofweek = daysofWeek.length;
		for(int i=0; i< count_daysofweek; i++)
		{
			System.out.println(daysofWeek[i]);
		}
		System.out.println("-----------------------------days-----------------------------");
		
		for(String days:daysofWeek)
		{
			System.out.println(days);
		}
		
		System.out.println("---------------Reverse order ---------------");
		for(int i=count_daysofweek-1; i>=0; i--)
		{
			System.out.println(daysofWeek[i]);
		}
}
}