package package_June09;

import java.util.Scanner;

public class MyActivity09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		int notes[] = {100, 50, 20, 10, 5, 2, 1};
		int noteNum[]  = new int[notes.length];

		System.out.println("please input the total amount:");
		int total =kb.nextInt();

		for ( int i = 0; i < notes.length; i++)
		{
			if ( total >= notes[i] )
			{
				noteNum[i] = total / notes[i];
				total = total - noteNum[i] * notes[i];
			} 
		}

		System.out.println("Total number of notes needed:");
		for ( int i = 0; i < notes.length; i++)
		{
			System.out.println("notes<" + notes[i] + "> needs: " + noteNum[i] ); 
		}

		kb.close();

	}

}
