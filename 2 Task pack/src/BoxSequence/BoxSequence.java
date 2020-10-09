package BoxSequence;

import java.util.Scanner;

public class BoxSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		
		System.out.println("Give a number");
		try(Scanner scanner = new Scanner(System.in)){
			if(scanner.hasNextInt()) {
				number = scanner.nextInt();
			} else {
				System.out.println("It's not a number");
				System.exit(0);
			}
		}
		System.out.println("This is the result: "+boxSeq(number));
	}

	public static int boxSeq(int steps) {
		int number = 0;
		if (steps == 0) {
			return 0;
	}
		else { 
			for (int i = 1;i<=steps;i++) {
				if(i%2==0) 
					number=number-1;
				else
					number=number+3;
			}
			return number;
		}
	}
}
