package package_June09;

import java.util.Scanner;

public class MyActivity01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Please input a num: ");
		int num = kb.nextInt();
		if (num > 0) {
			System.out.println("your num is positive");
		} else if ( num < 0){
			System.out.println("your num is negative");
		}
		else 
		{
			System.out.println("your num is zero");
		}
		
		kb.close();
	}

}
