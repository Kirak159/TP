package Fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number = 0;
		
		System.out.println("Give a number");
		try(Scanner scanner = new Scanner(System.in)){
			if(scanner.hasNextInt()) {
				number = scanner.nextInt();
			} else {
				System.out.println("It's not a number");
				System.exit(0);
			}
		}
		
		
		
		System.out.println("Fibonacci sequence="+fibonacci(number));
		
}
	

		public static int fibonacci(double number) {
			int FibNum=0;
			for (int i = 0;i<number;i++)
				FibNum=FibNum+i;
			return FibNum;
		}
}
