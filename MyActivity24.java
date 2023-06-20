package package_June09;

import java.util.Scanner;

public class MyActivity24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.print("input Ram age: ");
        int ageRam = kb.nextInt();

		System.out.print("input Shyam age: ");
        int ageShyam = kb.nextInt();

		System.out.print("input Ajay age: ");
        int ageAjay = kb.nextInt();

		String youngest = "";

		if (ageRam > 0 && ageShyam > 0 && ageAjay >0) 
		{
			if (ageRam < ageShyam)
			{
				if (ageRam < ageAjay)
				{
					youngest = "Ram";
				}
				else{
					youngest = "Ajay";
				}
			}
			else
			{
				if (ageShyam < ageAjay)
				{
					youngest = "Shyam";
				}
				else{
					youngest = "Ajay";
				}
			}

			System.out.println("youngest is " + youngest );
		}
		else 
		{
			System.out.println("age input error");
		}

		kb.close();
	}

}
