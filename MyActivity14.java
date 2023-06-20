package package_June09;

import java.util.Scanner;

public class MyActivity14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input cost:");
		double cost =Math.round(kb.nextDouble() * 100.0) /100.0;

		System.out.println("please input price:");
		double price =Math.round(kb.nextDouble() * 100.0) /100.0;


		if (price >= cost)
		{
			System.out.printf("profit = %.2f%n" , (price - cost));
		}
		else 
		{
			System.out.printf("loss = %.2f%n" , (cost - price));
		}

		kb.close();
	}

}
