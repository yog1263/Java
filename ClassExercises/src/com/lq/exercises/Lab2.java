/**
 * 
 */
package com.lq.exercises;

/**
 * @author developer
 *
 */
public class Lab2 {

	
	public static void main(String[] args) {
		int width;
		int height;
		int area;
		double radius=10.0;
		double pi=3.14;
		boolean result=true;
		
		//int[] daysInMonths = new int[12];
		String[] monthNames = {"January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December"};
		int[] daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		width=8;
		height = 12;
		area = width * height;
		System.out.println("Welcome to my world");
		System.out.println("The Value of width is "+ width);
		System.out.println("The Value of height is "+ height);
		System.out.println("The Value of area is "+ area);
		System.out.println("The Value of radius is "+ radius);
		System.out.println("The Value of pi is "+ pi);
		System.out.println("The Value of result is "+ result);
		
		int count_month_arr = monthNames.length;
		int count_day_arr = daysInMonths.length;
		
		if(count_month_arr == count_day_arr)
		{
			for(int i=0; i < count_month_arr; i++)
			{

					System.out.println(monthNames[i] + " has " + daysInMonths[i] + " days.");

			
			}
		

		}
	}}
