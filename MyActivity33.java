package package_June09;

import java.util.Scanner;

public class MyActivity33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input num1:");
		double num1 = kb.nextDouble();

		System.out.println("please input num2:");
		double num2 = kb.nextDouble();

		System.out.println("please input num3:");
		double num3 = kb.nextDouble();

		if (num1 <= num2 && num2 <= num3)
		{
			System.out.println("increasing order");
		}
		else if (num1 >= num2 && num2 >= num3)
		{
			System.out.println("decreasing order");
		}

		kb.close();
	}

}
