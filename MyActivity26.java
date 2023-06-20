package package_June09;

import java.util.Scanner;

public class MyActivity26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input the number:");
		double number =kb.nextDouble();

		System.out.println("the absolute value is " + Math.abs(number));

		kb.close();
	}

}
