package FlipEndChars;

import java.util.Scanner;

public class FlipsEndChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String line;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me a line");
			line= scanner.nextLine();
			
		System.out.println(flipEndChars(line));	
	}
	public static String flipEndChars(String line) {
		String newLine = "";
		char ps;
		char[] symbols = new char[line.length()];
		line.getChars(0, line.length(), symbols, 0);
		if(line.length()<2)
			return "Incompitable";
		else if(symbols[0]==symbols[line.length()-1])
			return "That's a pair";
		else {
			ps=symbols[0];
			symbols[0]=symbols[line.length()-1];
			symbols[line.length()-1]=ps;
			for (int i =0;i<line.length();i++) {
				newLine = newLine+symbols[i];
			}
			return newLine;
		}
			
	}
}
