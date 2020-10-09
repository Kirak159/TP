package Legs;

import java.util.Scanner;

public class LegsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int chkn=0,cow = 0,pig = 0;
		
		System.out.println("Give me number of chickens,cows and pigs");
		try(Scanner scanner = new Scanner(System.in)){
			if(scanner.hasNextInt()) {
				chkn = scanner.nextInt();
			} else {
				System.out.println("It's not a number");
				System.exit(0);
			}
			if(scanner.hasNextInt()) {
				cow = scanner.nextInt();
			} else {
				System.out.println("It's not a number");
				System.exit(0);
			}
			if(scanner.hasNextInt()) {
				pig = scanner.nextInt();
			} else {
				System.out.println("It's not a number");
				System.exit(0);
			}
		}
		
		System.out.println("This many legs do they have - "+animals(chkn,cow,pig));
		
		
}

	public static int animals(int chicks,int cows, int pigs) {
			return chicks*2+(cows+pigs)*4;
		}

}