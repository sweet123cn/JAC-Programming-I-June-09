package package_June09;

import java.util.Scanner;

public class MyActivity02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Please input num1: ");
		int num1 = kb.nextInt();
		
		System.out.print("Please input num2: ");
		int num2 = kb.nextInt();
		
		System.out.print("Please input num3: ");
		int num3 = kb.nextInt();
		
		System.out.print("Please input num4: ");
		int num4 = kb.nextInt();
		
		int maxNum = num1;
			
		if (num2 > maxNum ) 
		{
			maxNum = num2;
		}
		
		if (num3 > maxNum ) 
		{
			maxNum = num3;
		}
		
		if (num4 > maxNum ) 
		{
			maxNum = num4;
		}
		
		System.out.println("your greatest num is: " + maxNum);
		
		kb.close();
	}

}
