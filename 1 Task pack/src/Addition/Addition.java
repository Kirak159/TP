package Addition;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		
		System.out.println("Give me a number");
		try(Scanner scanner = new Scanner(System.in)){
			if(scanner.hasNextInt()) {
				a = scanner.nextInt();
			} else {
				System.out.println("It's not a number");
				System.exit(0);
			}
		}
		

		System.out.println("This is the result:"+addUpTo(a));
		
	}
	
	
	public static int addUpTo(int a) {
		int z=0;
		for (int i=1;i<a+1;i++)
			z=z+i;
		return z;
	}
}

