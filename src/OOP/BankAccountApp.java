package OOP;

public class BankAccountApp{

	public static void main(String[] args) {
		
		// create a new bank account
		// instantiating an object
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "092001001";
		
		// with encapsulation
		acc1.setName("Tony Hue");
		acc1.getName();
		
		acc1.setSsn("12343465");
		System.out.println("SSN is "+ acc1.getSsn());
				
		acc1.balance = 1000;
		System.out.println(acc1.toString());
		
		BankAccount acc2 = new BankAccount("Check Account");
		BankAccount acc3 = new BankAccount("Saving Account",1500);
		acc3.checkBalance();

		
		// demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance= 500;
		//cd1.name = "Tony";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
	}

}
