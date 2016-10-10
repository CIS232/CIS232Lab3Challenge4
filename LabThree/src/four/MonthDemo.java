package four;

import java.util.Scanner;

public class MonthDemo {
	public static void main(String[] args){
		int monthNumber;
		String monthName;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a month number 1-12: ");
		try{
			monthNumber = scan.nextInt();
		}
		catch(Exception e){
			System.out.println("Invalid month number. Please try again.");
			scan.next();
			monthNumber = 1;
		}
		//boolean greaterThan = true;
		//boolean lessThan = true;
		//boolean Equals = true;
		
		System.out.println("Month chosen: " + getMonthNumber());
	}

	private static String getMonthNumber() {
		return null;
	}
}
