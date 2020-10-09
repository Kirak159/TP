package Cubes;

import java.util.Scanner;

public class Cubes {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Give me a number of elements and elements");
		int n = 0;int[] mas = null;
		try(Scanner scanner = new Scanner(System.in)){
			if(scanner.hasNextInt()) {
				n = scanner.nextInt();
			} else {
				System.out.println("It's not a number");
				System.exit(0);
			}
			int i = 0;
			mas = new int [n];
			while(scanner.hasNextInt() && i<n)
				 {
					mas[i] = scanner.nextInt();
					i++;
				 }
		}
		System.out.println("Sum of cubes:"+sumOfCubes(mas));
	}
		


	
	
	
	
	public static int sumOfCubes(int[] mas) {
		int z=0;
		if (mas==null)
			return 0;
		for (int i=0;i<mas.length;i++)
			z=(int) (Math.pow(mas[i],3)+z);
		return z;
	}
	
}
