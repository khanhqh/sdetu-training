package OOP;

	class person {
	// variables
	String name;
	String email;
	String phone;
	
	// methods
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}
	
	
public class Demo {
	
	public static void main(String[]args) {
		//instantiating an object
		person p1 = new person();
		
		// define properties of objects
		p1.name = "Joe";
		p1.email = "joe@testemail.com";
		p1.phone = "1234358";
		
		//abstraction
		p1.walk();
		p1.sleep();
	}
}
