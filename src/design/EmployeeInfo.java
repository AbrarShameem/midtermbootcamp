package design;

import java.util.Scanner;

public class EmployeeInfo {
	

	static String companyName;
	private String name;
	
	public static void setCompanyName(String companyName){
		EmployeeInfo.companyName = companyName;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setEmployeeId (int employeeId){
		this.employeeId = employeeId;
	}
	public void setSalary(double salary){
		this.salary() = salary;
	}
	public void setSsn(String ssn) {
		this.ssn() = ssn;
	}

	public void setEmail() {
		this.email() = email;
	}




	public EmployeeInfo(int employeeId){
		
	}
    public EmployeeInfo(String name, int employeeId){
		
	}
	

	public static int calculateEmployeeBonus(int numberOfYearsWithCompany){
		int total=0;
		return total;
	}
	

	public static int calculateEmployeePension(){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);



		return total;
	}
	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
