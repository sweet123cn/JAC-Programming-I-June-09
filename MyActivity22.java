package package_June09;

import java.util.Scanner;

public class MyActivity22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.print("Are you married? (1: yes/0: no): ");
        int maritalStatus = kb.nextInt();

        System.out.print("Gender? (1: Male/0: Female): ");
        int gender = kb.nextInt();

		System.out.print("Your age?");
        int age = kb.nextInt();

        boolean insurance = false;

        if (maritalStatus == 1) 
		{
            insurance = true;
        } 
		else if ( gender == 1 && age > 30) 
		{
            insurance = true;
            
        } 
		else if (gender == 0 && age > 25) 
		{
			insurance = true;
        }

        System.out.println("Insurance: " + insurance);

        kb.close();

	}

}
