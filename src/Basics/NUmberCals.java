package Basics;

public class NUmberCals {
	public static void main(String[]args) {
		int num1 = 10;
		int num2 = 20;
		printName();
		addNumbers(num1,num2);
		multiNumbers(num1,num2);
	}
	static void printName() {
		System.out.println("My name is Tony");
	}
	static void addNumbers(int x, int y) {
		int sum = x +y;
		System.out.println("Sum of "+ x + " and "+ y + " is "+ sum);
		System.out.println();
	}
	static int multiNumbers(int val1, int val2) {
		int product = val1 * val2;
		return product;
	}
}
