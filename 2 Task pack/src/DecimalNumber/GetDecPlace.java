package DecimalNumber;

import java.util.Scanner;

public class GetDecPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String number;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me a double number");
			number= scanner.nextLine();
		
		System.out.println("The number of decimal is: "+ getDecimalPlaces(number));
	}
	
	
	
	public static int getDecimalPlaces(String number) {
		int k = 0;
		int z= 0;
		char[] symbols = new char[number.length()];
		number.getChars(0, number.length(), symbols, 0);
		for (int i=0;i<number.length();i++) {
			z++;
			if(symbols[i]=='.') 
				k=number.length() - z;
		}
		return  k;
	}
}


