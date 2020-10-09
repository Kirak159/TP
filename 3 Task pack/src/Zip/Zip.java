package Zip;

import java.util.Scanner;

public class Zip {

	
	public static void main(String[] args) {
		String line;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me a line");
			line= scanner.nextLine();
	
		System.out.println("The secnd encounter of zip is: "+findZip(line));
}
	
	public static int findZip(String line) {
		char[] symbols = new char[line.length()];
		line.getChars(0, line.length(), symbols, 0);
		int counter= 0,place = -1;
		for (int i = 0;i<line.length()-2;i++) {
			if(symbols[i]=='z' & symbols[i+1]=='i' & symbols[i+2]=='p') {
				counter++;
				if(counter==2) {
					place=i;
				}
			}
		}
		return place;
		
		
	}

}