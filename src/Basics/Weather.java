package Basics;

public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This program will give a suggestion what to wear based on the weather
		int temperature = 20;
		if(temperature >85) {
			System.out.println("It's pleasant. Wears T-shirt and shorts");
		}
		else if(temperature >60) {
			System.out.println("It is a litter cooler. Perhaps wear a long sleeve t-shirt");
		}
		else {
			System.out.println("Look like a cold day. Please bring sweater.");
		}

	}

}
