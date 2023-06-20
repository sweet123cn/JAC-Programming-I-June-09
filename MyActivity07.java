package package_June09;

import java.util.Scanner;

public class MyActivity07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("please input a week number(1-7):");
		int weekNum = kb.nextInt();
		String weekDay;
		
		switch ( weekNum ) {
		case 1:
			weekDay = "Monday";
			break;
		case 2:
			weekDay = "Tuesday";
			break;
		case 3:
			weekDay = "Wednesday";
			break;
		case 4:
			weekDay = "Thursday";
			break;
		case 5:
			weekDay = "Friday";
			break;
		case 6:
			weekDay = "Saturday";
			break;
		case 7:
			weekDay = "Sunday";
			break;
		default:
			weekDay = "error";
			break;
				
		}
		
		System.out.println("the week day is: " + weekDay);
		
		kb.close();
	}

}
