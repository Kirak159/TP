package Gamble;

import java.util.Scanner;

public class Gamble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double prob=0,prize = 0,pay = 0;
		
		System.out.println("Give me probability,prize and payment");
		try(Scanner scanner = new Scanner(System.in)){
			if(scanner.hasNextDouble()) {
				prob = scanner.nextDouble();
			} else {
				System.out.println("It's not a number");
				System.exit(0);
			}
			if(scanner.hasNextDouble()) {
				 prize= scanner.nextDouble();
			} else {
				System.out.println("It's not a number");
				System.exit(0);
			}
			if(scanner.hasNextDouble()) {
				pay = scanner.nextDouble();
			} else {
				System.out.println("It's not a number");
				System.exit(0);
			}
		}
		
		
		
		System.out.println("Is this profitable?Answer: "+profitableGamble(prob,prize,pay));
	}
	
	
	
	public static boolean profitableGamble(double prob,double prize,double pay) {
		if(prob*prize>pay)
			return true;
		else 
			return false;
	}

}
