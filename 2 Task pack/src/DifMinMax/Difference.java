package DifMinMax;

import java.util.Scanner;

public class Difference {

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
		System.out.println("This is the difference: "+differenceMaxMin(mas));

	}

	
	
	public static int differenceMaxMin(int[] mas) {
		int diffrnc = 0;
		int max=mas[0],min=mas[0];
		for (int i = 1;i<mas.length;i++) {
			if(max<mas[i]) max=mas[i];
			if(min>mas[i]) min=mas[i];
		}
		diffrnc=max-min;
		return diffrnc;
	}
}
