package package_June09;

import java.util.Scanner;
import java.util.Arrays;

public class MyActivity15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		String[] objects = { "Physics", "Chemistry", "Biology", "Mathematics", "Computer"};
		double[] marks = new double[5];
		Arrays.fill(marks, 0);

		String[] grades = new String[5];
		Arrays.fill(grades, ""); 
		double percentage = 0;
		double totalMarks = 0;
		String grade;

		for (int i = 0 ; i < objects.length ; i ++ )
		{
			System.out.println("please input " + objects[i] + " mark(<=100):");
			marks[i] =Math.round(kb.nextDouble() * 100.0) /100.0;

			totalMarks = totalMarks + marks[i];
			
			if ( marks[i] >= 90)
			{
				grades[i] = "A";
			}
			else if ( marks[i] >= 80)
			{
				grades[i] = "B";
			}
			else if ( marks[i] >= 70)
			{
				grades[i] = "C";
			} 
			else if ( marks[i] >= 60)
			{
				grades[i] = "D";
			} 
			else if ( marks[i] >= 40)
			{
				grades[i] = "E";
			} 
			else
			{
				grades[i] = "F";
			} 

			System.out.printf(objects[i] + " mark is %.2f grade is " + grades[i] + "%n" ,marks[i]);
		}

		percentage = (totalMarks /500 ) * 100;

		if ( percentage >= 90)
		{
			grade = "A";
		}
		else if ( percentage >= 80)
		{
			grade = "B";
		}
		else if ( percentage >= 70)
		{
			grade = "C";
		} 
		else if ( percentage >= 60)
		{
			grade = "D";
		} 
		else if ( percentage >= 40)
		{
			grade = "E";
		} 
		else
		{
			grade = "F";
		} 

		System.out.printf("average mark is %.2f grade is " + grade + "%n" ,percentage);



		kb.close();
	}

}
