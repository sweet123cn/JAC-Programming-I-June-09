package package_June09;

import java.util.Scanner;

public class MyActivity18 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("please input item price:");
		double itemPrice = kb.nextDouble();

		System.out.println("please input item quantity:");
		double itemQuantity = kb.nextDouble();

		double expense = 0 ;

		if ( itemPrice > 0 && itemQuantity > 0 )
		{
			expense = itemPrice * itemQuantity;
			
			if ( itemQuantity > 100)
			{
				expense = expense * 0.9;
			}

			System.out.printf("total expense = %.2f%n", expense );
		}
		else 
		{
			
			if ( itemPrice <= 0 )
			{
				System.out.println("your item price is error");
			}
			
			if ( itemQuantity <= 0 )
			{
				System.out.println("your item quantity is error");
			}
		}

		kb.close();

	}

}
