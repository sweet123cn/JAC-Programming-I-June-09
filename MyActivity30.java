package package_June09;

import java.util.Scanner;

public class MyActivity30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("please input your work hours:");
		double hours = kb.nextDouble();

		String efficiency = "";

		if ( hours > 0 )
		{
			if ( hours >= 2 && hours < 3 )
			{
				efficiency = "high efficiency";
			}
			else if ( hours >= 3 && hours < 4 ) 
			{
				efficiency = "be ordered to improve speed";
			}
			else if ( hours >= 4 && hours < 5 ) 
			{
				efficiency = "training to improve speed";
			}
			else if ( hours >= 5 ) 
			{
				efficiency = "leave the company";
			}

			System.out.println("your efficiency is " + efficiency);
		}
		else 
		{
			System.out.println("you input hours error.");
		}

		kb.close();
	}

}
