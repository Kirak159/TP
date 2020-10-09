package Discriminant;

import java.util.Scanner;

public class Discriminant {

	public static void main(String[] args) {
		int a=0,b = 0,c = 0;
		
		System.out.println("Give me a,b and c");
		try(Scanner scanner = new Scanner(System.in)){
			if(scanner.hasNextInt()) {
				a = scanner.nextInt();
			} else {
				System.out.println("It's not a number");
				System.exit(0);
			}
			if(scanner.hasNextInt()) {
				 b= scanner.nextInt();
			} else {
				System.out.println("It's not a number");
				System.exit(0);
			}
			if(scanner.hasNextInt()) {
				c = scanner.nextInt();
			} else {
				System.out.println("It's not a number");
				System.exit(0);
			}
		}
		System.out.println("How many solutions:"+solutions(a,b,c));
	}
	
	
	public static int solutions(int a,int b,int c) {
		int Discr=(b*b)-4*a*c;
		if(Discr== 0) {
			return 1;
		}
		else if(Discr> 0) {
			return 2;
		}
		else {
			return 0;
		}
	}

}
