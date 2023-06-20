package package_June09;

import java.util.Scanner;

public class MyActivity05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("please input a number:");
		
		int num = kb.nextInt();
		
		if (num % 2 == 0)
		{
			System.out.println("the number is even");
		}
		else
		{
			System.out.println("the number is odd");
		}
		
		
		kb.close();
		
	}

}
