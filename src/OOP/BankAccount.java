package OOP;

public class BankAccount implements IRate
{
	// define variables
	String accountNumber;
	
	// static belongs to the class not the object instance
	//final constants
	
	//instant variables
	private static final String routingNumber = "09111000";
	private String name;
	String ssn;
	String accountType;
	double balance = 0;
	
	// constructor definitions: unique method
	/*
	 * 1. They are used to define /setup/ initialize properties of an object
	 * 2. constructors are implicitly call upon instantiation
	 * 3. the same name as the class itself
	 * 4. constructor has no return type
	 */
	BankAccount(){
		System.out.println("New Account creates....");
	}
	
	// Overloading call same name with arguments
	BankAccount(String accountType){
		System.out.println("New Account "+ accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		System.out.println("New Account "+ accountType);
		System.out.println("Initial Deposit of $ "+ initDeposit);
		String msg= null;
		if(initDeposit <1000) {
			msg = "Error: Minimum deposit must be at least $1000";
		}
		else {
			msg = "Thank you for your initial deposit $ "+ initDeposit;
		}
		System.out.println(msg);
		balance += initDeposit;
		
	}
	
	// define method
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	//getting and setting	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	// interface methods
	public void setRate() {
		System.out.println("Set Rate");
	}
	
	public void increaseRate() {
		System.out.println("Increase rate");
		
	}

	// public show in the project
	// void default  modify in the package
	//private verify in the class
	public void deposit(double amount) {
		balance += amount;
		showActivity("Deposit");
	}
	
	void withdraw(double withdraw) {
		balance -=withdraw;
		showActivity("Withdraw");
	}
	
	private void showActivity(String activity) {
		System.out.println("Your new Transaction "+ activity);
		System.out.println("Your new balance is $ "+ balance);
	}
	
	void checkBalance() {
		System.out.println("Balance "+ balance);
	}
	
	void getStatus() {
		
	}
	
	//@Overide
	public String toString() {
		return "[ "  + name+ ", "+ accountNumber + ", Balance $ "+ balance + "]"; 
	}
	
}
