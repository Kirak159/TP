package LastOperations;

import java.util.Scanner;

public class MathABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=0;
		System.out.println("Give me 2 edges");
		try(Scanner scanner = new Scanner(System.in)){
			if(scanner.hasNextInt()) {
				a = scanner.nextInt();
			} else {
				System.out.println("It's not a number");
				System.exit(0);
			}
			if(scanner.hasNextInt()) {
				b = scanner.nextInt();
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
		
		
		System.out.println(""+abcmath(a,b,c));
	}

	
	
	public static boolean abcmath(int a,int b,int c) {
		for (int i = 0;i<b;i++) {
			a=a+a;
		}
		if(a%c==0) 
			return true;
		else
			return false;
	}
}
