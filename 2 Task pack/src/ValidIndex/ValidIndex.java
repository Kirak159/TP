package ValidIndex;

import java.util.Scanner;

public class ValidIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Index;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me an Index");
			Index= scanner.nextLine();
		
		System.out.println("The index is valid: "+ isValid(Index));
	}
	
	
	
	public static boolean isValid(String number) {
		if(number.length()>5)
			return false;
		int k = 0;
		char[] symbols = new char[number.length()];
		number.getChars(0, number.length(), symbols, 0);
		char[] cypher= {'1','2','3','4','5','6','7','8','9','0'};
		for (int i=0;i<number.length();i++) {
			for (int j=0;j<cypher.length;j++) {
				if(symbols[i]==cypher[j]) {
					k++;}}
		}
		if(k<5)
			return false;
		else
			return true;
	}

}
