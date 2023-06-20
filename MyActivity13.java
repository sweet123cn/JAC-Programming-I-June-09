package package_June09;

import java.util.Scanner;

public class MyActivity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("if a quadratic equation as ax^2+bx+c=0 ");

		System.out.println("please input a:");
		double a =Math.round(kb.nextDouble() * 100.0) /100.0;

		System.out.println("please input b:");
		double b =Math.round(kb.nextDouble() * 100.0) /100.0;

		System.out.println("please input c:");
		double c =Math.round(kb.nextDouble() * 100.0) /100.0;

		double discriminant =  b * b -4 * a * c;

		if (discriminant >= 0)
		{
			double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("x1 = " + x1 + " x2 = " +x2);
		}
		else 
		{
			System.out.println("this quadratic equation has no real roots");
		}

		kb.close();
	}

}
