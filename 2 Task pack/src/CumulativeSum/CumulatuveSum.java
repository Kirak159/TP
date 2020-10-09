package CumulativeSum;

import java.util.Scanner;

public class CumulatuveSum {

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
		System.out.println("The Average is whole: "+cumulativeSum(mas));
	}
	
	public static int[] cumulativeSum(int[] mas) {
		
		int[] newmas= new int[mas.length];
		newmas[0]=mas[0];
		for (int i = 1;i<mas.length;i++) {
			newmas[i]=mas[i]+mas[i-1];
		}
		return newmas;
	}
}
