package package_June09;

import java.util.Scanner;

public class MyActivity03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		double carrotsPrice = 2.0;
		double onionsPrice = 4.0;
		double meatPrice = 10.0;

		System.out.println("Enter the number of lbs of Carrots:");
		double carrotsLbs = kb.nextDouble();

		System.out.println("Enter the number of lbs of Onions:");
		double onionsLbs = kb.nextDouble();

		System.out.println("Enter the number of lbs of Meat:");
		double meatLbs = kb.nextDouble();

		double total, tax;

		tax = 0;

		total = (carrotsLbs * carrotsPrice) + 
				(onionsLbs * onionsPrice) +
				(meatLbs * meatPrice);

		System.out.println("Enter the payment cash or card? (Enter 'cash' or 'card'):");
		String payment = kb.next();

		if (payment.equalsIgnoreCase("card") || payment.equalsIgnoreCase("cash"))
		{
			if (payment.equalsIgnoreCase("card"))
			{
				tax = total * 0.13;
			}

			System.out.printf("The total amount is: $%.2f%n", total);
			System.out.printf("The total tsx is: $%.2f%n", tax);
			System.out.printf("The total amount to be paid is: $%.2f%n", (total + tax));
			
		}
		else 
		{
			System.out.println("The payment is error!");
		}

		kb.close();
	}

}
