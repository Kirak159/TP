package TriangleArea;

import java.util.Scanner;

public class TriArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height=0,base = 0;
		
		System.out.println("Give me base and height");
		try(Scanner scanner = new Scanner(System.in)){
			if(scanner.hasNextDouble()) {
				base = scanner.nextDouble();
			} else {
				System.out.println("It's not a number");
				System.exit(0);
			}
			if(scanner.hasNextDouble()) {
				height = scanner.nextDouble();
			} else {
				System.out.println("It's not a number");
				System.exit(0);
			}
		}
		
		
		
		System.out.println("Triangle's area is S="+triarea(height,base));
		
}
	

		public static double triarea(double he,double ba) {
			return 0.5*he*ba;
		}
			
	}

