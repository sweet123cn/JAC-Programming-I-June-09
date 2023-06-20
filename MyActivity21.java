package package_June09;

import java.util.Scanner;

public class MyActivity21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input your mark(<=100):");
		double mark =Math.round(kb.nextDouble() * 100.0) /100.0;

		String division;

		if ( mark > 0  && mark <= 100)
		{
			if ( mark >= 60)
			{
				division = "first division";
			}
			else if (  mark >= 50)
			{
				division = "second division";
			}
			else if (  mark >= 40)
			{
				division = "third division";
			} 
			else 
			{
				division = "Fail";
			} 
		
			System.out.printf("the mark is %.2f, the division is %s%n", mark, division);
		}
		else
		{
			System.out.println("the mark is error");
		}

		kb.close();
	}

}
