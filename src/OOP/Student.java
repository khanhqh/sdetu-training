package OOP;

public class Student {
	private static int ID = 10;	
	private String name;
	private String SSN;
	private String email;	// 	automatic create an email ID by name
	private String userId;	//Generate a userID by combination of Static ID, random 4 digit number 
	// between 1000 and 9000 and last 4 of SSN
	
	private double balance = 0;
	private String course = "";
	private static final double costOfCourse = 800;
	
	private String phone;
	private String city;
	private String state;
	
	private void setPhone(String phone) {
		this.phone = phone;
	}
	private String getPhone() {
		return phone;
	}
	
	private void setCity(String city) {
		this.city = city;
	}
	private String getCity() {
		return city;
	}
	private void setState(String state) {
		this.state = state;
	}
	private String getState() {
		return state;
	}
	
	public Student(String name, String SSN){
		this.name = name;
		this.SSN = SSN;
		setEmail();
		ID++;
		setUserId();
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "."+ ID + "@abc.com";
		System.out.println("Your email is "+ email);
	}
	
	private String getEmail() {
		return email;
	}
	
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int random = (int)(Math.random() * (max- min));
		random += min;
		userId = ID + random + SSN.substring(0,4);
		System.out.println(userId);
	}
	
	public void enroll(String course) {
		
		this.course +=  "\n"+ course;
		balance += costOfCourse;
		
	}
	
	public void payTution(double amount) {
		balance -= amount;
		System.out.println("You pay "+ amount);
		
	}
	
	public void checkBalance() {
		System.out.println("Your balance is "+ balance);
		
	}
	
	public String toString() {
		return "[Name "+ name + "\nAccount "+ userId  +"\nBalance is "+ balance;
		
		
	}
	public void showCourse() {
		System.out.println("You enrolled course "+ course);
	}

}
