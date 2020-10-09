package AvgWhole;

import java.util.Scanner;

public class AvgWhole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mas;
		int numelmnts;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me number of elements");
			numelmnts= scanner.nextInt();
			mas= new int[numelmnts];
		System.out.println("Give me elements of array");
		for (int i= 0;i<numelmnts;i++) {
			mas[i]= scanner.nextInt();
		}
		System.out.println("The Average is whole: "+isAvgWhole(mas));

	}
	public static boolean isAvgWhole(int[] mas) {
		double avg = 0;
		
		for (int i = 0;i<mas.length;i++) {
			avg=avg+mas[i];
		}
		avg=avg/mas.length;
		if(avg==(int)avg)
			return true;
		else 
			return false;
	}

}
