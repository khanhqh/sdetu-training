package OOP;

public class StudentDB {

	public static void main(String[] args) {
		Student st = new Student("Jean", "344218901");
		st.enroll("Eng112");
		st.enroll("His101");
		st.showCourse();
		st.checkBalance();
		st.payTution(500);
		st.checkBalance();
		System.out.println(st.toString());
	}

}
