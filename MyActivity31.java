package package_June09;

import java.util.Scanner;

public class MyActivity31 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input number 1:");
		double num1 = kb.nextDouble();

		System.out.println("please input number 2:");
		double num2 = kb.nextDouble();

		System.out.println("please input number 3:");
		double num3 = kb.nextDouble();

		if (num1 == num2 && num1 == num3 )
		{
			System.out.println("these three numbers are equal");
		}
		else
		{
			System.out.println("these three numbers are not equal");
		}

		kb.close();
	}

}
