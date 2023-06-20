package package_June09;

import java.util.Scanner;

public class MyActivity35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input number:");
		int num = kb.nextInt();

		if ( num % 5 == 0)
		{
			System.out.println("the number " + num + " is multiple of 5");
		}
		else 
		{
			System.out.println("the number " + num + " is not multiple of 5");
		}


		kb.close();
	}

}
