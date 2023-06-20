package package_June09;

import java.util.Scanner;

public class MyActivity06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("please input a year:");
		int year = kb.nextInt();
		
		if (((year % 4 == 0)&&( year % 100 != 0)) || (year % 400 == 0) )
		{
			System.out.println("the year " + year +" is a leap year");
		}
		else
		{
			System.out.println("the year " + year +" is not a leap year");
		}
		
		kb.close();
		
	}

}
