package StrangePair;

import java.util.Scanner;

public class StrangePair {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		String FirstWord,SecndWord;
		try(Scanner scanner = new Scanner(System.in)){
		System.out.println("Give me a first word");
			FirstWord= scanner.nextLine();
		
		System.out.println("Give me a second word");
			SecndWord= scanner.nextLine();
		};
	
		System.out.println("The index is valid: "+ isStrangePair(FirstWord,SecndWord));
		
	}
	
	public static boolean isStrangePair(String FirWord, String SecndWord) {
		 if (FirWord.length() == 0 && SecndWord.length() == 0) {
	            return true;
		 }
		if ((FirWord.charAt(0)==SecndWord.charAt(SecndWord.length())) 
				&& ((FirWord.charAt(FirWord.length())==SecndWord.charAt(0))))
			return true;
		else 
			return false;
	}

}
