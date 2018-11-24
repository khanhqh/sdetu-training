package lab;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("897129183", 1000);
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(1000);
		acc1.payBill(400);
		acc1.accrute();
		System.out.println(acc1.toString());
	}
}
	
class BankAccount implements IInterest {
	private static int ID = 1000;	// internal ID 
	private String accountNumber;	// ID + random 2 digits numbers + first 2 of ssn
	private static final String rountingNumber = "004100047";
	private String name;
	private String ssn;
	private double balance;
	
	// constructor
	public BankAccount(String ssn, double initDeposit) {
		ID++;
		this.ssn = ssn;
		setAccountNumber();
		balance = initDeposit;
	}
	
	public void payBill(double amount) {
		System.out.println("Paying bill "+ amount);
		balance -= amount;
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		System.out.println("Making deposit "+ amount);
		balance +=amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance "+ balance);
	}
	private void setAccountNumber() {
		int random = (int)(Math.random() * 100);
		accountNumber = ID + ""+ random + ssn.substring(0,2) ;
		System.out.println("Your Account Number "+ accountNumber);
	}
	public void setName(String name) {
		this.name =name;
	}
	public String getName() {
		return name;
	}

	@Override
	public void accrute() {
		balance = balance *(1+ rate/100);		
		showBalance();
	}
	
	public String toString() {
		return "[Name " + name + "\nAccount Number "+ accountNumber + "\nRounting number "+ rountingNumber + 
				"\nBalance " + balance + "]";
	}
}


