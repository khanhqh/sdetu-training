package Basics;
public class SalaryCalculate {
	public static void main(String[] args) {
		// Let Create variables to define our career
		// declare variables
		String career;
		System.out.println("Programming is starting");
		career = "Software Developer";
		
		System.out.println("My career: "+ career);
		// declare and define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		double salary = rate * hoursPerWeek * weeksPerYear;
		
		System.out.println("My salary as a "+ career + " at the rate "+ rate + " per hour is $ "
				+ salary + " per year. ");
		//compute our annual salary
		// rate * hoursPerWeek * weeksPerYear
		

	}

}
