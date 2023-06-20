package package_June09;

import java.util.Scanner;

public class MyActivity19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input current year:");
		int currentYear = kb.nextInt();

		System.out.println("please input year you entered organization:");
		int enterYear = kb.nextInt();

		double bonus = 0 ;

		if ( currentYear > 0 && enterYear > 0  && (currentYear - enterYear) >= 0)
		{			
			if ( (currentYear - enterYear) > 3)
			{
				bonus = 2500;
			}

			System.out.printf("your bonus = %.2f%n", bonus );
		}
		else 
		{
			
			if ( currentYear <= 0 )
			{
				System.out.println("your current year is error");
			}
			
			if ( enterYear <= 0 )
			{
				System.out.println("your enter year is error");
			}

			if ( (currentYear - enterYear) < 0 )
			{
				System.out.println("your enter year is later than current year");
			}
		}

		kb.close();
	}

}
