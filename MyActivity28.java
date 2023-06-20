package package_June09;

import java.util.Scanner;

public class MyActivity28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input hardness:");
		double hardness =kb.nextDouble();

		System.out.println("please input carbon content:");
		double carbon =kb.nextDouble();

		System.out.println("please input tensile strength:");
		double tensile =kb.nextDouble();

		int bitGrade = 0;
		int grade = 0;

		if ( hardness > 50)
		{
			bitGrade |= 4;
		}

		if ( carbon > 0.7)
		{
			bitGrade |= 2;
		}

		if ( tensile > 5600)
		{
			bitGrade |= 1;
		}

		System.out.println("bitGrade is " + String.format("%3s", Integer.toBinaryString(bitGrade)).replace(' ', '0')); 

		if ( bitGrade == 0b111)
		{
			grade = 10;
		}
		else if ( bitGrade == 0b110)
		{
			grade = 9;
		}
		else if ( bitGrade == 0b011)
		{
			grade = 8;
		}
		else if ( bitGrade == 0b101)
		{
			grade = 7;
		}
		else if ( bitGrade == 0b100 || bitGrade == 0b010 || bitGrade == 0b001)
		{
			grade = 6;
		}
		else if ( bitGrade == 0b000 )
		{
			grade = 5;
		}

		System.out.println("Grade is " + grade);

		kb.close();
	}

}
