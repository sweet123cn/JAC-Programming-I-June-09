package package_June09;

import java.util.Scanner;

public class MyActivity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input units:");
		double units = kb.nextDouble();

		double bill = 0, surcharge = 0, rate =0, totalbill = 0;

		if ( units > 0 )
		{
			if ( units <= 50)
			{
				rate = 0.50;
				bill = rate * units;
			}
			else if ( units > 50 && units <= 200)
			{
				rate = 0.75;
				bill = 50 * 0.5 + (units - 50) * rate;
			}
			else if ( units > 200 && units <= 450)
			{
				rate = 1.2;
				bill = 50 * 0.5 + 150 * 0.75 +(units - 200) * rate ;
			}
			else if ( units > 450 )
			{
				rate = 1.5;
				bill = 50 * 0.5 + 150 * 0.75 + 250 * 1.2 +(units - 450) * rate ;
			}

			surcharge = bill * 0.2;

			totalbill = bill + surcharge;

			System.out.printf("Electricity bill  = %.2f surcharge = %.2f total bill = %.2f %n", bill, surcharge, totalbill);
		}
		else 
		{
			System.out.println("your units is error");
		}

		kb.close();
	}

}
