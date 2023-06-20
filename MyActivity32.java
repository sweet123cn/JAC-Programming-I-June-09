package package_June09;

import java.util.Scanner;

public class MyActivity32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input an positive integer:");
		int num = kb.nextInt();

		if ( num >= 0)
		{
			int digitCount = countDigits(num);

			System.out.println("the number is " + digitCount + " digits");

		}
		else 
		{
			System.out.println("the number you input is not positive");
		}

		kb.close();
	}

	public static int countDigits(int number) {
		if (number == 0 )
		{
			return 1;
		}

		int count = 0 ;

		while (number != 0)
		{
			count = count + 1;
			number = number/10;
		}

		return count;

	}

}
