package PrefixSuffix;

import java.util.Scanner;

public class PrefixSuffix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String FirstWord,SufOrPref;
		try(Scanner scanner = new Scanner(System.in)){
		System.out.println("Give me a first word");
			FirstWord= scanner.nextLine();
		
		System.out.println("Give me a second word");
			SufOrPref= scanner.nextLine();
			
		if(isPrefOrSuf(SufOrPref)) {
			System.out.println("Has this word a prefix: "+isPrefix(FirstWord,SufOrPref));}
		else
			System.out.println("Has this word a suffix: "+isSuffix(FirstWord,SufOrPref));};
	}
		public static boolean isPrefix(String Word, String Prefix) {
			char[] symbols = new char[Prefix.length()];
			Prefix.getChars(0, Prefix.length(), symbols, 0);
			String RPrefix = "";
			for (int i = 0; i<symbols.length-1;i++) {
				RPrefix=RPrefix+symbols[i];
			}
			return Word.startsWith(RPrefix);
		}
		public static boolean isSuffix(String Word, String Suffix) {
			char[] symbols = new char[Suffix.length()];
			Suffix.getChars(0, Suffix.length(), symbols, 0);
			String RSuffix = "";
			for (int i = 1; i<symbols.length;i++) {
				RSuffix=RSuffix+symbols[i];
			}
			return Word.endsWith(RSuffix);
		}
		public static boolean isPrefOrSuf(String SufOrPref) {
			char[] symbols = new char[SufOrPref.length()];
			SufOrPref.getChars(0, SufOrPref.length(), symbols, 0);
			if(symbols[0]=='-')
				
				return false;
			else
				return true;
		}

}
