package package_June09;

import java.util.Scanner;

public class MyActivity27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input length:");
		double length =kb.nextDouble();

		System.out.println("please input width:");
		double width =kb.nextDouble();

		double area = length * width;
		double perimeter = 2 * (length + width);

		System.out.println("area is " + area);		

		System.out.println("perimeter is " + perimeter);

		if (area > perimeter)
		{
			System.out.println("area is greater");
		}
		else
		{
			System.out.println("perimeter is greater");
		}

		kb.close();
	}

}
