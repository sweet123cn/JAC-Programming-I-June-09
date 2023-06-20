package package_June09;

import java.util.Scanner;

public class MyActivity29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input days you late:");
		double days = kb.nextDouble();

		double fine = 0;

		if ( days > 0 )
		{
			if ( days >= 1 && days <= 5)
			{
				fine = 0.50;
			}
			else if ( days >= 6 && days<= 10)
			{
				fine = 1;
			}
			else if ( days > 10)
			{
				fine = 5;
			}

			System.out.printf("fine  = %.2f %n", fine);

			if (days > 30)
			{
				System.out.println("Your member ship will be canceled");
			}
		}
		else 
		{
			System.out.println("your days is error");
		}

		kb.close();
	}

}
