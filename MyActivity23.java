package package_June09;

import java.util.Scanner;

public class MyActivity23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.print("input 5 digit number: ");
        int num = kb.nextInt();

		int reverseNum = 0, originalNum = num;

		int digit = 0;

		while (num != 0)
		{
			digit  = num % 10;
			reverseNum = reverseNum * 10 + digit;
			num = num / 10;

		}

		System.out.println("reverse number: " + reverseNum);
		System.out.print("Number and Reverse Number is:");

		if (originalNum == reverseNum)
		{ 
			System.out.println("Equal");
		}
		else
		{  
			System.out.println("Not Equal");
		}

		kb.close();
		
	}

}
