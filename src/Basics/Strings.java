package Basics;

public class Strings {
	public static void main(String[]args) {
		String bookTitle;
		bookTitle = "The Lord of the Ring";
		String wordChoice = "Choice";
		
		if(wordChoice.equalsIgnoreCase("choice")) {
			System.out.println("The browse is choice");
		}
		System.out.println(bookTitle.substring(0,1));
		System.out.println(bookTitle.substring(5));
	}
}
