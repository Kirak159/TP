package AscII;

import java.io.IOException;
import java.io.InputStreamReader;

public class AscII {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char symb;
		System.out.println("Give me a symbol");
		InputStreamReader in = new InputStreamReader(System.in);
		symb = (char)in.read();
		
		System.out.println("ASCII-code:"+ctoa(symb));
	}
	
	
	public static int ctoa(char symbol) {
		return (int)symbol;
	}
	
}
