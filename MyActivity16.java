package package_June09;

import java.util.Scanner;

public class MyActivity16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input basic salary:");
		double salary = kb.nextDouble();

		double HRA = 0, DA = 0, grossSalary = 0 ;

		if ( salary > 0 )
		{
			if ( salary <= 10000)
			{
				HRA = 0.2 * salary;
				DA = 0.8 * salary;
			}
			else if ( salary <= 20000)
			{
				HRA = 0.25 * salary;
				DA = 0.9 * salary;
			}
			else 
			{
				HRA = 0.3 * salary;
				DA = 0.95 * salary;
			}

			grossSalary = salary + HRA +DA;

			System.out.printf("Gross Salary = %.2f%n", grossSalary );
		}
		else 
		{
			System.out.println("your basic salary is error");
		}

		kb.close();
	}

}
