package Basics;

public class FibonacciApp {

	public static void main(String[] args) {
		// Fibonnaci numbers is defined by the sum of the 2 previous fibonacci number
		/*
		 * fib(0) = 0;
		 * fib(1)= 1;
		 * fib(2) = fib(1)+ fib(0) = 1
		 * fib(3) = fib(2) + fib(1) = 1 +1 = 2
		 * fib(4) = fib(3) + fib(2) = 2 + 1 = 3
		 */
		int[]a = {5,2,9,1};
		System.out.println("Sum of 2 previous Fibonacci numbers: "+ fib(6));
		System.out.println("Factorial n!: "+ factoria(5));
		System.out.println("Sum of 1 to n number: "+ sumOfNNumbers(8));
		System.out.println("Min of array: "+ minArray(a));
		System.out.println("Average of array: "+averageArray(a));
		System.out.println("Max of array: "+ maxArray(a));
		
					
	}
	// sum of 2 previous fibonacci numbers
	public static int fib(int n) {
		if(n ==0)
			return 0;
		else if (n ==1)
			return 1;
		else
			return ((fib(n-1))+ (fib(n-2)));
	}
	// Total of factoria numbers
	// 1! = 1;
	//2! = 2. *1 = 2
	//3! = 3* 2* 1 = 6
	//4! = 4 * 3 * 2 * 1 = 24
	static int factoria(int n) {
		if (n==1 || n ==0)
			return 1;
		else
			return factoria(n-1)* n;		
	}
	// function that takes a value n returns the sum of numbers 1 to n
	/*
	 * n =2, sum = 1 + 2 = 3
	 * n=3, sum = 1 + 2 + 3 = 6
	 * n= 4 , sum = 1 + 2 +3 +4 = 10
	 */
	static int sumOfNNumbers(int n) {
		if(n==1)
			return 1;
		else if (n==0)
			return 0;
		else
			return sumOfNNumbers(n-1)+ n;
					
	}
	
	//Write 3 functions that take an array as a 
	//parameter and return the minimum, average, and maximum values of that array.
	static int minArray(int[]x) {
		int min = x[0];
		for(int i =0;i<x.length;i++) {
			if(x[i]< min )
				min= x[i];				
					
		}
		return min;
		
	}
	// calculate the average in the array
	static double averageArray(int[]x) {
		int sum = 0;
		for(int i =0;i<x.length-1;i++) {
			sum += x[i];
		}
		return sum / x.length;
	}
	// Find the max value in the array
	static int maxArray(int[]x) {
		int max = x[0];
		for(int i =0;i<x.length-1;i++) 
			if(x[i]>max)
				max = x[i];
			return max;
	}
	

}


