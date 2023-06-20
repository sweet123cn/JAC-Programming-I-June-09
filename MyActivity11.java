package package_June09;

import java.util.Scanner;

public class MyActivity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input the side A:");
		double sideA =Math.round(kb.nextDouble() * 100.0) /100.0;

		System.out.println("please input the side B:");
		double sideB =Math.round(kb.nextDouble() * 100.0) /100.0;

		System.out.println("please input the side C:");
		double sideC =Math.round(kb.nextDouble() * 100.0) /100.0;


		System.out.printf("side A= %.2f%n" , sideA);
		System.out.printf("side B= %.2f%n" , sideB);
		System.out.printf("side C= %.2f%n" , sideC);

		if ( sideA > 0 && sideB > 0 && sideC > 0 && 
		     ((sideA + sideB) > sideC) &&  ((sideB + sideC) > sideA) && ((sideC + sideA) > sideB) )
		{
			
			System.out.println("the sides are valid");
		}
		else
		{
			System.out.println("the sides are invalid");
		}

		kb.close();
	}

}
