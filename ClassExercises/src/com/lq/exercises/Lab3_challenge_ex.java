/**
 * 
 */
package com.lq.exercises;

/**
 * @author developer
 *
 */
public class Lab3_challenge_ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Start of output for challenge exercises");
		int let_off=4;
		boolean printing=false;
		int day_count = 1;
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		for(int y=0; y<5;y++)
		{
			for(int x=0; x<7; x++)
			{
				if(printing == false)
				{
					System.out.println("    ");
					if(x == let_off)
					{
						printing=true;
					}
				}
				else if(day_count < 10)
				{
					System.out.print(day_count + "    ");
					day_count++;
				}
				else
				{
					System.out.print(day_count + "   ");
					day_count++;
				}
			}
			System.out.println();
		}

	}

}
