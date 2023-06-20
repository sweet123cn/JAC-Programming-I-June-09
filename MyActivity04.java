package package_June09;

import java.util.Scanner;

public class MyActivity04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb  = new Scanner(System.in);

		System.out.println("pleae input a number:");
        
		int num = kb.nextInt();

		if (num % 55 == 0)
		{
			System.out.println("the num is divisible by 5 and 11");
		}
		else 
		{
			System.out.println("the num is not divisible by 5 and 11");
		}

		kb.close();
	}

}
