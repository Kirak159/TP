package DoingNumbers;

import java.util.Scanner;

public class NumberOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b = 0,n = 0;
		
		System.out.println("Give me a,b and n");
		try(Scanner scanner = new Scanner(System.in)){
			if(scanner.hasNextInt()) {
				n = scanner.nextInt();
			} else {
				System.out.println("It's not a number");
				System.exit(0);
			}
			if(scanner.hasNextInt()) {
				 a= scanner.nextInt();
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
		}
		
		System.out.println("This is what you do:"+operation(a,b,n));
	}

	
	
	public static String operation(int a, int b, int n) {
		if (a+b==n)
			return "Added";
		else if(a-b==n)
			return "Substracted - (a-b)";
		else if(b-a==n)
			return "Substracted - (b-a)";
		else if(a*b==n)
			return "Multiplied";
		else if(a/b==n)
			return "Divided - (a/b)";
		else if(b/a==n)
			return "Divided - (b/a)";
		else 
			return "None";
	}
}
