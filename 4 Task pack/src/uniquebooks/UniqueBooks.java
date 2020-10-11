package uniquebooks;

import java.util.Scanner;
public class UniqueBooks {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Enter a line");
	        String line = scanner.nextLine();

	        
	        System.out.println("Enter separator character");
	        char separator = scanner.next().charAt(0);

	      
	        System.out.println(countUniqueBooks(line, separator));
	}
	
	
	 public static int countUniqueBooks(String str, char c) {
	        int counter = 0;
	        int start = str.indexOf(c, 0);
	        int end = str.indexOf(c, start + 1);

	        String buff = "";

	        while (start != -1 && end != -1) {
	            for (int i = start + 1; i < end; i++) {
	                if (buff.indexOf(str.charAt(i)) == -1) {
	                    counter++;
	                }
	                buff += str.charAt(i);
	            }

	            start = str.indexOf(c, end + 1);
	            end = str.indexOf(c, start + 1);
	            buff = "";
	        }

	        return counter;
	    }

}
