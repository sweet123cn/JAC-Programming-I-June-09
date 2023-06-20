package package_June09;

import java.util.Scanner;

public class MyActivity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input the angleA:");
		double angleA =Math.round(kb.nextDouble() * 100.0) /100.0;

		System.out.println("please input the angleB:");
		double angleB =Math.round(kb.nextDouble() * 100.0) /100.0;

		System.out.println("please input the angleC:");
		double angleC =Math.round(kb.nextDouble() * 100.0) /100.0;

		double angleTotal = angleA + angleB + angleC;
		angleTotal=Math.round(angleTotal * 100.0) /100.0;


		System.out.printf("angleA= %.2f%n" , angleA);
		System.out.printf("angleB= %.2f%n" , angleB);
		System.out.printf("angleC= %.2f%n" , angleC);
		System.out.printf("angleTotal= %.2f%n" , angleTotal);

		if ( angleA > 0 && angleB > 0 && angleC > 0 && angleTotal ==180)
		{
			
			System.out.println("the angles are valid");
		}
		else
		{
			System.out.println("the angles are invalid");
		}

		kb.close();
	}

}
