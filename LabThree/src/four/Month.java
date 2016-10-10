package four;

public class Month {
	
	//Write a class named Month. The class should have an int field named
	//monthNumber that holds the number of the month.
	
	public int monthNumber;
	public String MonthName;
	
	public Month() throws Exception { //sets monthNumber to 1
		this.monthNumber = 1;
		setMonthName(monthNumber);
	}
	
	public Month(int monthNumber) throws Exception {
								   //if int is between 1 and 12, monthNumber is set
							   	  //and setMonthName is called
		if (monthNumber >=1 || monthNumber <= 12){
			this.monthNumber = monthNumber;
			setMonthName(monthNumber);
		}
		else					//or else monthNumber is set to 1
		{
			monthNumber = 1;
			throw new Exception("Invalid number.");
		}
	}
	
	private Month(String monthName) {
		this.MonthName = monthName;
		setMonthNumber(monthName);
	}
	
	public void setMonthName(int monthNumber) throws Exception {
		switch(monthNumber)
		{
			case 1: MonthName = "January";
					break;
			case 2: MonthName = "February";
					break;
			case 3: MonthName = "March";
					break;
			case 4: MonthName = "April";
					break;
			case 5: MonthName = "May";
					break;
			case 6: MonthName = "June";
					break;
			case 7: MonthName = "July";
					break;
			case 8: MonthName = "August";
					break;
			case 9: MonthName = "September";
					break;
			case 10: MonthName = "October";
					break;
			case 11: MonthName = "November";
					break;
			case 12: MonthName = "December";
					break;
			default: monthNumber = 1;
					break;
		}
	}
	
	//private String toString(){
	//	return getMonthName();
	//}
	
	public String getMonthName() { //return to main
		return MonthName;
	}
	
	public void setMonthNumber(String monthName) { //accepts string, sets int value
		switch(monthName)
		{
		case "January":
			monthNumber = 1;
			break;
		case "February":
			monthNumber = 2;
			break;
		case "March":
			monthNumber = 3;
			break;
		case "April":
			monthNumber = 4;
			break;
		case "May":
			monthNumber = 5;
			break;
		case "June":
			monthNumber = 6;
			break;
		case "July":
			monthNumber = 7;
			break;
		case "August":
			monthNumber = 8;
			break;
		case "September":
			monthNumber = 9;
			break;
		case "October":
			monthNumber = 10;
			break;
		case "November":
			monthNumber = 11;
			break;
		case "December":
			monthNumber = 12;
			break;
		default: monthNumber = 1;
				break;
		}
	}
	
	public int getMonthNumber() { //return to main as int
		return monthNumber;
	}
	
	public boolean Equals(Month monthNumber) { //compares month values
		return monthNumber.getMonthNumber()==this.monthNumber;
	}
	
	public boolean greaterThan(Month monthNumber) { //compares month values
		return monthNumber.getMonthNumber()>this.monthNumber;
	}
	
	public boolean lessThan(Month monthNumber) { //compares month values
		return monthNumber.getMonthNumber()<this.monthNumber;
	}
}
