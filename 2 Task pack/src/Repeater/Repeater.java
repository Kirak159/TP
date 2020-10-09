package Repeater;

import java.util.Scanner;

public class Repeater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word;
		int times;
		System.out.println("Give me word and times");
		try(Scanner scanner = new Scanner(System.in)){
				word = scanner.next();
				times= scanner.nextInt();
	}
		char[] symbols = new char[word.length()];
		word.getChars(0, word.length(), symbols, 0);
		
		System.out.println("This is the result:"+repeat(symbols,times));

}
	
	public static String repeat(char[] symbols,int times) {
		String newword="";
		for(int i = 0;i<symbols.length;i++) {
			for(int j=0;j<times;j++) {
				newword=newword+symbols[i];
			}
		}
		return newword;
	}
}
