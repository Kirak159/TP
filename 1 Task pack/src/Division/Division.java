package Division;

import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fnumber = 0,scndnumber=0;
		
		
		System.out.println("Give me 2 numbers");
		try(Scanner scanner = new Scanner(System.in)){
			if(scanner.hasNextInt()) {
				fnumber = scanner.nextInt();
			} else {
				System.out.println("It's not a number");
				System.exit(0);
			}
			if(scanner.hasNextInt()) {
				scndnumber = scanner.nextInt();
			} else {
				System.out.println("It's not a number");
				System.exit(0);
			}
		}
		
		
		
	System.out.println("This is what's left - "+remainder(fnumber,scndnumber));
		
	}

	
	public static int remainder(int Fnum, int Snum) {
		return Fnum%Snum;
	}
}
