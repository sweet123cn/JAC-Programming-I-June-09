package package_June09;

import java.util.Scanner;

public class MyActivity34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input num1:");
		double num1 = kb.nextDouble();

		System.out.println("please input operation(+ - * /):");
		char operation = kb.next().charAt(0);

		System.out.println("please input num2:");
		double num2 = kb.nextDouble();

		double res = 0 ;

		switch ( operation )
		{
			case  '+' :
			{
				res = num1 + num2;
				break;
			}
			case  '-' :
			{
				res = num1 - num2;
				break;
			}
			case  '*' :
			{
				res = num1 * num2;
				break;
			}
			case  '/' :
			{
				if (num2 != 0 )
				{
					res = num1 / num2;
				}
				else
				{
					System.out.println("Error: the num2 is zero");
					System.exit(0);
				}
				break;
			}
			default :
			{
				System.out.println("Error: the operation is invaild");
				System.exit(0);
			}

		}

		System.out.println("Result is: " + res);

		kb.close();
	}

}
