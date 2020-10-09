package TriangleEdge;

import java.util.Scanner;
 
public class TriangleEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0;
		
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
		}

		System.out.println("The last edge: "+nextEdge(a,b));
		
	}
	
	
	public static int nextEdge(int a,int b) {
		return a+b-1;
	}

}
